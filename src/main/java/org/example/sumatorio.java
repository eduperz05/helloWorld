package org.example;

public class sumatorio {
    private int[] num;
    private int resultant;

    public sumatorio(int[] nums) {
        this.num = nums;
        int acc = 0;
        int i = 0;
        while (i < 10) {
            acc += nums[i];
            i++;
        }
        this.resultant = acc;
    }
    public int getResultant() {
        return resultant;
    }
}
