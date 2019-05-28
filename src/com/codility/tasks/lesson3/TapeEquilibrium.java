package com.codility.tasks.lesson3;

import static java.lang.Math.abs;

public class TapeEquilibrium{
    public static int solution(int[] A) {

        int sum = 0, sumAbs = 0;

        for(int i = 0; i < A.length; i++){
            sum += A[i];
            sumAbs += abs(A[i]);
        }

        int minimalDiference = abs(sumAbs), partSum = 0, diference = 0;

        for(int i = 0; i < A.length - 1; i++){

            partSum += A[i];
            diference = abs(2 * partSum - sum);

            if( diference == 0) {
                return diference;
            }
            if(diference < minimalDiference){
                minimalDiference = diference;
            }
        }
        return minimalDiference;
    }
    public static void main(String[] args){
        int[] A = {3, 1, 2, 4, 3};
        int[] B = {-1000, 1000};
        int solution = solution(A);
        System.out.println(solution);
        solution = solution(B);
        System.out.println(solution);
    }
}
