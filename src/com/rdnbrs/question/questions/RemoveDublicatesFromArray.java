package com.rdnbrs.question.questions;

public class RemoveDublicatesFromArray {

    public static void main(String[] args) {

        int[] num = {1};
        System.out.println(removeDuplicates(num));
    }

    public static int removeDuplicates(int[] nums) {
        /*List<Integer> last = new ArrayList<>();

        for (int value : nums) {
            if (!last.contains(value)) {
                last.add(value);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < last.size())
                nums[i] = last.get(i);
        }

        return last.size();*/
        /**
        * No extra memory
        * */
        if(nums.length == 1){
            return 1;
        }

        int changeIndex = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (i == nums.length - 2) {
                if (nums[i] != nums[i + 1]) {
                    nums[changeIndex++] = nums[i];
                    nums[changeIndex++] = nums[i + 1];
                }
                else{
                    nums[changeIndex++] = nums[i];
                }
            } else if (nums[i] != nums[i + 1]) {
                nums[changeIndex++] = nums[i];
            }
        }

        return changeIndex;

    }
}
