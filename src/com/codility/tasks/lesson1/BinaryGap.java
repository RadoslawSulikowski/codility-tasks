package com.codility.tasks.lesson1;

public class BinaryGap{
    public int solution(int N){

        String binNumber = "";
        int binaryGap = 0, countZeros = 0, countOnes = 0;
        StringBuilder builder = new StringBuilder(binNumber);

        if(N == 0 || N == 1) {
            return 0;
        }
        while(N != 1) {
            builder.append(N % 2);
            N /= 2;
        }
        builder.append(1);
        binNumber = builder.reverse().toString();
        for(int i = 0; i < binNumber.length(); i++) {
            if(binNumber.charAt(i) == '1') {
                ++countOnes;
                if(countZeros > binaryGap) {
                    binaryGap = countZeros;
                }
                countZeros = 0;
            } else {
                if(countOnes != 0) {
                    ++countZeros;
                }
            }
        }
        return binaryGap;
    }
    public static void main(String[] args) {
        BinaryGap sample = new BinaryGap();
        sample.solution(34);
    }
}
