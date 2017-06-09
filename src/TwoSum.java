/**
 * Created by zeweiyang on 2017/6/8.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(target ==(nums[i]+nums[j])){
                    result[0]=i;
                    result[1]=j;
                    break;
                }
            }
        }
        System.out.println(result[0]+" "+result[1]);
        return result;
    }

}