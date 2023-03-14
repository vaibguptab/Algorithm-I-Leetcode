package Algorithm_I;

import java.util.ArrayList;

public class Day11 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }

    public static ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        backtrack(a,new ArrayList<Integer>(),nums);
        return a;
    }

    private static void backtrack(ArrayList<ArrayList<Integer>> a, ArrayList<Integer> tempList,int[] num) {
        if (tempList.size()== num.length){
            a.add(new ArrayList<Integer>(tempList));
            return;
        }
        for (int e:num){
            if (tempList.contains(e)){
                continue;
            }
            tempList.add(e);
            backtrack(a,tempList,num);
            tempList.remove(tempList.size()-1);
        }
    }
}
