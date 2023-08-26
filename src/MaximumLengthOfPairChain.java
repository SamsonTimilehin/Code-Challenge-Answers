import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthOfPairChain {

    public static void main(String[] args) {

        int [][] newArray = {{1,2},{3,4},{5,6}};
        System.out.println(findLongestChain(newArray));

    }

    public static int findLongestChain(int[][] pairs) {
        int ans = 0;
        int prevEnd = Integer.MIN_VALUE;

        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));

        for (int[] pair : pairs)
            if (pair[0] > prevEnd) {
                ans++;
                prevEnd = pair[1];
            }

        return ans;
    }
}
