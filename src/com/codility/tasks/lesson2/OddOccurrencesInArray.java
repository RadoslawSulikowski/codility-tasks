package com.codility.tasks.lesson2;

public class OddOccurrencesInArray{
    public int solution(int[] A){
        for(int i = 0; i < A.length; i++) {
            if(A[i] == 0) {
                continue;
            } else if(i == A.length - 1) {
                return A[i];
            } else {
                for(int j = i + 1; j < A.length; j++) {
                    if(A[i] == A[j]) {
                        A[j] = 0;
                        break;
                    }
                    if(j == (A.length - 1) && A[j] != A[i]) {
                        return A[i];
                    }
                }
            }
        }
        return 0;
    }
}
