import java.util.Arrays;

public class FindErrorNumber {

    public static void main(String[] args) {

        int [] nums = {1,2,3,4,3};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int duplicate = 0;

        for (final int num : nums) {
            if (nums[Math.abs(num) - 1] < 0)
                duplicate = Math.abs(num);
            else
                nums[Math.abs(num) - 1] *= -1;
        }

        for (int i = 0; i < nums.length; ++i)
            if (nums[i] > 0)
                return new int[] {duplicate, i + 1};

        throw new IllegalArgumentException();
    }
}
