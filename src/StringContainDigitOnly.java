import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringContainDigitOnly {

    public static void main(String[] args) {

        String digit = "23iy41";
        System.out.println(stringContainDigitOnly(digit));
        System.out.println(digit.chars().count());
        int[] num = new int[]{2,7,11,15};
        System.out.println(Arrays.toString(twoSum(num, 18)));
    }

    public static boolean stringContainDigitOnly(String str){

        return !str.chars().anyMatch(n -> !Character.isDigit(n));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> keyToValue = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(keyToValue.containsKey(target - nums[i])){
                return new int[]{keyToValue.get(target - nums[i]),i};
            }
            keyToValue.put(nums[i], i);
        }
        return new int[]{};
    }
}
