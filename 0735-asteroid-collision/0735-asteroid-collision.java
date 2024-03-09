class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (stack.isEmpty()) {
                stack.push(asteroid);

            } else {
                int val = stack.peek();
                if (val > 0 && asteroid < 0) {

                   
                    while (!stack.isEmpty() && stack.peek() > 0 && Math.abs(stack.peek()) < Math.abs(asteroid)) {
stack.pop();}
                         if (!stack.isEmpty() && stack.peek() == Math.abs(asteroid)) {
                        stack.pop(); // Destroy both asteroids
                    } 
                       else if (stack.isEmpty() ||stack.peek() < 0) {
                            stack.push(asteroid);
                        }

                    

                } else {
                    stack.push(asteroid);

                }

            }
        }
        int[] arr = new int[stack.size()];
        int i = arr.length - 1;
        while (!stack.isEmpty()) {
            arr[i] = stack.pop();
            i--;
        }
        return arr;
    }
}