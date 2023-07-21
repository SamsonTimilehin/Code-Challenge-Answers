public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int[] result = twoSum(nums, 13);
        for (int i : result) {
            System.out.println(i);
        }
    }

    public static int[] twoSum(int[] numbers, int target){

        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int x = (numbers[i] + numbers[j]);
            if (x == target) {
                int[] result = new int[2];
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            } else if (x < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[2];
    }
}
