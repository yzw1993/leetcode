import java.util.HashMap;
import java.util.Map;

/**
 * Created by zeweiyang on 2017/6/9.
 * 使用hashmap o(n)
 */
public class TwoSum2 {
        public int[] twoSum2(int[] nums, int target) {
            int[] result =new int[2];
          Map<Integer,Integer> map =new HashMap<Integer,Integer>();
          for (int i =0;i<nums.length;i++){
              if(map.containsKey(target-nums[i])){
                  result[1] = i;
                  result[0] =map.get(target-nums[i]);
                  return result;
              }
              map.put(nums[i],i);
          }
            return result;
        }
}
