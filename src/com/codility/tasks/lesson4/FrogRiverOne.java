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
}
