package com.codility.tasks.lesson6;

import java.util.Arrays;

public class Triangle {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0 || A[A.length -1] < 1) {
            return 0;
        }

        for (int i = 0; i < A.length -2; i++) {
            if (A[i] < 1) {
                continue;
            }
            if ((A[i] + A[i + 1]) > A[i + 2]) {
                return 1;
            }
        }
        return 0;
    }
}
