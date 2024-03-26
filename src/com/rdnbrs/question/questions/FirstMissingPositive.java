package com.rdnbrs.question.questions;

import java.util.Arrays;

public class FirstMissingPositive {

    /**
     * https://leetcode.com/problems/first-missing-positive/description/
     * Best solution
     *
     * class Solution {
     *     public int firstMissingPositive(int[] nums) {
     *        int i=0;
     *        while(i<nums.length){
     *         int correct=nums[i]-1;
     *         if(correct!=i && nums[i]>0 && nums[i]<nums.length){
     *             if(nums[i]!=nums[nums[i]-1]){
     *                 swap(nums,i,correct);
     *             }
     *             else{
     *                 i++;
     *             }
     *         }
     *         else{
     *             i++;
     *         }
     *        }
     *        for(int j=0;j<nums.length;j++){
     *         if(nums[j]!=j+1){
     *             return j+1;
     *         }
     *        }
     *        return nums.length+1;
     *     }
     *     static void swap(int[] arr,int x,int y){
     *         int temp=arr[x];
     *         arr[x]=arr[y];
     *         arr[y]=temp;
     *     }
     * }
     * */
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int min = nums.length == 1 ? nums[0] : Integer.MAX_VALUE;
        int max = nums[nums.length - 1];
        int response = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < 0) continue;
            if (min > nums[i]) min = nums[i];
            if (nums[i + 1] - nums[i] > 1) {
                response = nums[i] + 1;
                break;
            }
        }
        if (min == Integer.MAX_VALUE) min = nums[nums.length - 1];
        if (min > 1 || max < 0) return 1;

        return response != 0 ? response : nums[nums.length - 1] + 1;
    }

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
        System.out.println(firstMissingPositive(new int[]{1, 2, 0}));
        System.out.println(firstMissingPositive(new int[]{3, 4, -1, 1}));
        System.out.println(firstMissingPositive(new int[]{-1, -2, -60, 40, 43}));
        System.out.println(firstMissingPositive(new int[]{1}));
        System.out.println(firstMissingPositive(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 23, 20}));
        System.out.println(firstMissingPositive(new int[]{-10, -3, -100, -1000, -239, 1}));
    }

}
