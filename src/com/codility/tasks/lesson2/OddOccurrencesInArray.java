package com.codility.tasks.lesson2;

import java.util.Arrays;

public class OddOccurrencesInArray{
    public int solution(int[] A) {
        int counter = 1;

        Arrays.sort(A);
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == A[i + 1]) {
                counter++;
            } else {
                if (counter % 2 == 1) {
                    return A[i];
                } else {
                    counter = 1;
                }
            }
        }
        return A[A.length - 1];
    }
}
