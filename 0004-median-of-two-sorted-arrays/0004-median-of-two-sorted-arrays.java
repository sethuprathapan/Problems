class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int m = nums1.length, n = nums2.length;
        int left = 0, right = m;
        
        while (left <= right) {
            int partitionA = (left + right) / 2;
            int partitionB = (m + n + 1) / 2 - partitionA;
            
            int maxLeftA = (partitionA == 0) ? Integer.MIN_VALUE : nums1[partitionA - 1];
            int minRightA = (partitionA == m) ? Integer.MAX_VALUE : nums1[partitionA];
            int maxLeftB = (partitionB == 0) ? Integer.MIN_VALUE : nums2[partitionB - 1];
            int minRightB = (partitionB == n) ? Integer.MAX_VALUE : nums2[partitionB];
            
            if (maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if ((m + n) % 2 == 0) {
                    return (Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB)) / 2.0;
                } else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            } else if (maxLeftA > minRightB) {
                right = partitionA - 1;
            } else {
                left = partitionA + 1;
            }
        }
        return 0.0;
  
    //     int i=0,j=0;
    //     int k =0;
    //     while(i<nums1.length && j<nums2.length){
    //         arr[k]=(nums1[i]<=nums2[j])?nums1[i]:nums2[j];
    //         k++;
    //         if(nums1[i]<=nums2[j]){
    //             i++;
    //         }else{
    //             j++;
    //         }

    //     }
    //     while(i<nums1.length){
    //         arr[k]=nums1[i];
    //         k++;
    //         i++;
    //     }
    //      while(j<nums2.length){
    //         arr[k]=nums2[j];
    //         k++;
    //         j++;
    //     }
    //    int len= nums2.length+nums1.length;
    //    if(len%2==0){
           
    //                 return ((arr[len/2]+arr[(len/2)-1])/2.00);


    //    }else{
    //        return(arr[len/2]);
    //    }

       

       

    }
}