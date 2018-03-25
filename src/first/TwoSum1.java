package first;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author codeAC
 * @date 2018/3/25 16:28
 */
public class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        //初始解
//        int i =nums.length;
//        for(int j = 0;j<i;j++){
//            int temp = target - nums[j];
//            for(int k = j+1;k<i;k++){
//                if(nums[k]==temp){
//                    return new int[]{j,k};
//                }
//            }
//        }
//        return null;
//    }
        //借鉴优化解
        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                System.out.println(true);
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i],i);
        }
        return res;
    }
}
