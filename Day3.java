package Algorithm_I;

public class Day3 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};

        Q283(nums);
        for (int e:nums) System.out.println(e);
    }

    private static void Q283(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num: nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
