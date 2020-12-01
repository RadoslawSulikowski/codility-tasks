package com.codility.tasks.lesson6;

public class NumberOfDiscIntersections {
    public int solution(int[] A) {
        int counter = 0;
        if (A.length == 0) {
            return 0;
        }
        for(int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                long li = i - A[i];
                long hi = i + A[i];
                long lj = j - A[j];
                long hj = j + A[j];
                if (li <= hj && lj <= hi) {
                    counter++;
                }
                if (counter > 10000000) {
                    return -1;
                }
            }
        }
        return counter;
    }
}
