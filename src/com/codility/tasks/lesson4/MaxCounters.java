package com.codility.tasks.lesson4;

public class MaxCounters{
    public int[] solution(int N, int[] A) {

        int[] B = new int[N];
        int maxCounterGlobal = 0, maxCounterLocal = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] < N+1) {
                B[A[i] - 1]++;
                if(maxCounterLocal < B[A[i] - 1]) {
                    maxCounterLocal = B[A[i] - 1];
                }
            } else {
                if( maxCounterLocal == 0) {
                    continue;
                }
                B = new int[N];
                maxCounterGlobal += maxCounterLocal;
                maxCounterLocal = 0;
            }
        }
        for (int i = 0; i < N; i++) {
            B[i] += maxCounterGlobal;
        }
        return B;
    }
}
