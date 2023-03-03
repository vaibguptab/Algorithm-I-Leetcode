package Algorithm_I;

import static Leetcode_problems.Day12.isBadVersion;

public class Day1 {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        System.out.println(Q704(arr,9));

        System.out.println(Q278(5));

        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(Q35(nums,target));
    }

    public static int Q704(int[] nums, int target) {
        int start =0,end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target) start = mid+1;
            else if(nums[mid] > target) end = mid-1;
        }
        return -1;
    }

    public static int Q278(int n) {
        if (n == 1) {
            return 1;
        }

        int start = 1;
        int end = n;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (!isBadVersion(mid)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    private static int Q35(int[] arr,int k) {
        int start = 0,end = arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid]==k) return mid;
            else if (arr[mid]<k) {
                start = mid+1;
            } else if (arr[mid] > k) {
                end = mid-1;
            }
        }
        return start;
    }
}
