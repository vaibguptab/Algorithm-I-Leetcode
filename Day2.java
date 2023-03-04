package Algorithm_I;

import ADA.Q;

import java.util.Arrays;

public class Day2 {
    public static void main(String[] args) {
        int[] nums={-4,-1,0,3,10};
        int[] Q977 = sortedSquares(nums);
//        for (int e: Q977) System.out.print(e+" ");

        int[] Q189 = {1,2,3,4,5,6,7};
        Rotate_Array(Q189,3);
        for (int e:Q189) System.out.print(e+" ");
    }

    private static void Rotate_Array(int[] q189,int k) {
        int n = q189.length;
        int start =0,end = n-1;
        if (k>n) k = k%n;

        reverse(q189,start,end);
        reverse(q189,start,k-1);
        reverse(q189,k,end);
    }

    private static void reverse(int[] arr, int low, int high) {
        while(low<high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
}
