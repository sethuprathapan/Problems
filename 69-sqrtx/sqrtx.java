class Solution {
    public int mySqrt(int x) {
        if (x< 2) return x;
        long upper = 0, upperIndex = 1;
        long lower = 0, lowerIndex = 1;
        long next, i = 0;
        while (x >= upper) {
            i = i + 1;
            next = i * i;
            lower = upper;
            lowerIndex = i - 1;
            upper = next;
            upperIndex = i;

        }

        double mid = (lowerIndex + .5) * (lowerIndex + .5);
        return (int)(((upper - mid) > (mid - lower)) ? lowerIndex : upperIndex);

    }

}