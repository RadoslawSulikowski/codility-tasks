package com.codility.tasks.lesson2;

public class CyclicRotation {
    public int[] solution(int[] A, int K) {
        int [] B = new int [A.length];
        if (A.length == 0 || K % A.length == 0) {
            return A;
        } else {
            int R = K % A.length;
            for (int i = 0; i < A.length; i ++) {
                if ((i + R) < A.length) {
                    B[i+R] = A[i];
                } else {
                    B[i + R - A.length] = A[i];
                }
            }
        }
        return B;
    }
}
