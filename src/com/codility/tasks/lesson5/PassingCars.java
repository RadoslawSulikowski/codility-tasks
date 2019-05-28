package com.codility.tasks.lesson5;

public class PassingCars{
    public int solution(int[] A){

        double[] P = new double[A.length + 1];
        int passCars = 0;

        for(int i = A.length; i > 0; i--) {
            P[i - 1] = P[i] + A[i - 1];
            if(A[i - 1] == 0) {
                passCars += P[i];
                if(passCars > 1000000000) {
                    return -1;
                }
            }
        }
        return passCars;
    }
}
