package com.codility.tasks.lesson4;

public class FrogRiverOne{
    public int solution(int X, int[] A){

        int[] B = new int[X];
        for(int i = 0; i < B.length; i++) {
            B[i] = 0;
        }
        boolean ifAllLeaves = true;
        int controlNumber = X;

        for(int i = 0; i < A.length; i++) {
            B[A[i] - 1] += 1;

            if(A[i] == controlNumber) {

                ifAllLeaves = true;
                for(int j = 0; j < X; j++) {
                    if(B[j] == 0) {
                        controlNumber = j + 1;
                    }
                    ifAllLeaves = ifAllLeaves && (B[j] != 0);
                }
                if(ifAllLeaves) {
                    return i;
                }
            }
        }
        return -1;
    }
//    time complexity: O(N)
//    public int solution(int X, int[] A) {
//        int [] B = new int [X];
//        int sum = 0;
//        for( int i = 1; i < X + 1; i++) {
//            B[i - 1] = i;
//            sum += i;
//        }
//        for (int i = 0; i < A.length; i++) {
//            if (B[A[i] - 1] != 0) {
//                sum -= A[i];
//                B[A[i] - 1] = 0;
//            }
//            if (sum == 0) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
