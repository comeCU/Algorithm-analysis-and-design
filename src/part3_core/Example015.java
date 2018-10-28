package part3_core;
/**
 * 
 * @ClassName: Example015 
 * @Description: 数列最大字段和。
 *               参考solution:(https://leetcode.com/problems/maximum-subarray/discuss/?orderBy=most_votes)
 * @author: dong
 * @date: 2018年10月28日 上午11:14:19 
 * @keyword: 二分法不独立、dp
 *
 */
public class Example015 {

    /**
     * version 1.0
     * 获得数列的最大子段和
     * 时间复杂度O(nlogn)
     * @param arr 任意int型数组
     * @param start 判读的起始位置，下标从0开始
     * @param end 判读的终止位置，最大值为(arr.length - 1)
     * @return 最大子段和
     */
    public int maxSubSum(int[] arr, int start, int end) {
        int center, i, j, sum, leftSum, rightSum, s1, s2, lefts, rights;
        
        if(start == end) {
            if(arr[start] > 0) {
                return arr[start];
            } else {
                return 0;
            }
        } else {
            center = (start + end) / 2;
            leftSum = maxSubSum(arr, start, center);
            rightSum = maxSubSum(arr, center + 1, end);
            
            s1 = 0;
            lefts = 0;
            for (i = center; i >= start; i--) {
                lefts = lefts + arr[i];
                if(lefts > s1) {
                    s1 = lefts;
                }
            }
            
            s2 = 0;
            rights = 0;
            for(j = center + 1; j < end; j++) {
                rights = rights + arr[j];
                if(rights > s2) {
                    s2 = rights;
                }
            }
            
            if(s1 + s2 < leftSum && rightSum < leftSum) {
                return leftSum;
            }
            if(s1 + s2 < rightSum && leftSum < rightSum) {
                return rightSum;
            }
            return s1 + s2;
        }
    }
    
    /**
     * version 2.0 
     * 时间复杂度 O(n)
     * @param arr 任意int型数组
     * @param start 判读的起始位置，下标从0开始
     * @param end 判读的终止位置，最大值为(arr.length - 1)
     * @return 最大子段和
     */
    public int maxSubArray(int[] arr, int start, int end) {
        if(arr == null || arr.length == 0) {
            return 0;
        }
        int maxSoFar = arr[0], maxEndingHere = arr[0];
        for (int i = start; i <= end; i++) {
            maxEndingHere = Math.max(maxEndingHere + arr[i], arr[i]);
            maxSoFar = Math.max(maxEndingHere, maxSoFar);  
        }
        
        return maxSoFar;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Example015 example015 = new Example015();
        int[] arr = {-2, 11, -4, 13, -5, -2};
        int max = example015.maxSubArray(arr, 0, 5);
        System.out.println(max);
    }

}
