public class RemoveDuplicateFromSortedArray {



    public static void main(String[] args) {

        int[] sortedArray = {1,1,2,2,3,4};
        System.out.println(removeDuplicates(sortedArray));
    }

    public static int removeDuplicates(int[] A) {
        if (A.length < 2)
            return A.length;
        int j = 0;
        int i = 1;
        while (i < A.length) {
            if (A[i] != A[j]) {
                j++;
                A[j] = A[i]; }
            i++;
        }
        return j + 1; }
}
