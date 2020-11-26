package com.codility.tasks.lesson6;

import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        int count = 1;
        if (A.length == 1) {
            return 1;
        } else if (A.length == 0) {
            return 0;
        }
        else {
            Arrays.sort(A);
            for (int i = 0; i < A.length - 1 ; i++) {
                if (A[i] != A[i + 1]) {
                    count++;
                }
            }
        }
        return count;
    }
}
