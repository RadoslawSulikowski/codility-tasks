package com.codility.tasks.lesson1;

public class BinaryGap{
    public int solution(int N){

        String binNumber = "";
        int binaryGap = 0, countZeros = 0, countOnes = 0;

        if(N == 0 || N == 1) {
            return 0;
        }
        while(N != 1) {
            binNumber = ((Integer) (N % 2)).toString() + binNumber;
            N /= 2;
        }
        binNumber = "1" + binNumber;

        for(int i = 0; i < binNumber.length(); i++) {
            if(binNumber.charAt(i) == '1') {
                ++countOnes;
                if(countZeros > binaryGap) {
                    binaryGap = countZeros;
                }
                countZeros = 0;
            } else {
                if(countOnes == 0) {
                    continue;
                } else {
                    ++countZeros;
                }
            }
        }
        return binaryGap;
    }
}
