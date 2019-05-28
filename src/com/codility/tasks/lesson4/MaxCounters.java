package com.codility.tasks.lesson4;

import java.util.Arrays;

public class MaxCounters{
    public int[] solution(int N, int[] A){

        int[] B = new int[N];
        int[] C = new int[N];
        Arrays.fill(B, 0);
        Arrays.fill(C, 0);
        int tempMaxB = 0;
        int maxB = 0;

        for(int i = 0; i < A.length; i++) {
            if(A[i] <= N) {
                B[A[i] - 1] += 1;
                if(B[A[i] - 1] > tempMaxB) {
                    tempMaxB = B[A[i] - 1];
                }
            }
            if(A[i] > N && i != 0 && A[i - 1] != N + 1) {

                maxB += tempMaxB;
                tempMaxB = 0;
                B = Arrays.copyOf(C, N);
            }
        }

        for(int i = 0; i < B.length; i++) {
            B[i] += maxB;
        }
        return B;
    }
}
