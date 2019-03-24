import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = {1, 3, 6, 4, 1, 2};
        int[] B = {-1, -4, 6};

        System.out.println(s.solution(B));
        System.out.println(s.solution(A));
    }

    public int solution(int[] A) {
        Arrays.sort(A);
       // System.out.println(A[A.length - 1]);
        if (A[A.length - 1] < 0) {

            return 1;
        }

        if(A[A.length-1]>1000000 ||A[0]<-1000000){
            return 1;
        }

        //   System.out.println(A);

        int counter = 0;
        int k = 0;
        while (counter >= A[k]) {
            k++;
        }
        counter = A[k];
      //  System.out.println(counter);
        for (int i = k; i < A.length; i++) {
            while (A.length-1>i & counter == A[i] ) {
                i++;
            }
            counter++;
            if (counter != A[i]) {
                return counter;
            }
        }
        counter = A[A.length - 1] + 1;


        return counter;
    }
}
//    This is a demo task.
//
//        Write a function:
//
//class Solution { public int solution(int[] A); }
//
//that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//        For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//        Given A = [1, 2, 3], the function should return 4.
//
//        Given A = [−1, −3], the function should return 1.
//
//        Write an efficient algorithm for the following assumptions:
//
//        N is an integer within the range [1..100,000];
//        each element of array A is an integer within the range [−1,000,000..1,000,000].
