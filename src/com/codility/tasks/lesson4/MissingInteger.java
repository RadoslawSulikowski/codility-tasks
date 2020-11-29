package com.codility.tasks.lesson4;

public class MissingInteger {
    public int solution(int[] A) {

        int[] B = new int [1000001];

        for (int i : A) {
            if (i > 0) {
                B[i]++;
            }
        }
        for (int i = 1; i < B.length; i++) {
            if (B[i] == 0) {
                return i;
            }
        }
        return 0;
    }
}
