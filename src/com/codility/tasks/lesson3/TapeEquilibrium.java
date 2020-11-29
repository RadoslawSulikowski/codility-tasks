package com.codility.tasks.lesson3;

import static java.lang.Math.abs;

public class TapeEquilibrium {
    public static int solution(int[] A) {

        int sum1 = 0, sum2 = 0, lowestDiff = 0, diff;

        for (int i : A) {
            sum1 += i;
            lowestDiff += abs(i);
        }
        for (int i = 0; i < A.length - 1; i++) {
            sum1 -= A[i];
            sum2 += A[i];
            diff = abs(sum1 - sum2);

            if (diff < lowestDiff) {
                lowestDiff = diff;
            }
        }
        return lowestDiff;
    }
}
