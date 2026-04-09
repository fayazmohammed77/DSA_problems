import java.util.HashMap;
import java.util.*;
class Twosum{
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int rem = target - nums[i];
            if(hm.containsKey(rem)){
                return new int[] {hm.get(rem),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int result[] = twoSum(nums,target);
    }
}