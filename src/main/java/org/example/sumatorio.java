package org.example;

public class sumatorio {
    private final int resultant;
    private final int[] nums;

    public sumatorio(int[] nums) {
        this.nums = nums;
        int acc = Integer.MIN_VALUE;
        int i = 0;
        while (i < 10) {
            acc += nums[i];
            i++;
        }
        this.resultant = acc;
    }

    public int greaterNum() {
        int bigger = 0;
        for (int num : this.nums) {
            if (bigger < num) {
                bigger = num;
            }
        }
        return bigger;
    }
    public int getResultant() {
        return resultant;
    }
}
