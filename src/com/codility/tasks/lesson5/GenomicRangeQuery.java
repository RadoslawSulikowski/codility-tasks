package com.codility.tasks.lesson5;

import java.util.Arrays;

public class GenomicRangeQuery {
    public int[] solution(String S, int[] P, int[] Q) {

        int[] Sol = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            String subS = S.substring(P[i], Q[i] + 1);
            char[] sortedAr = subS.toCharArray();
            Arrays.sort(sortedAr);

            if (sortedAr[0] == 'A') {
                Sol[i] = 1;
            }
            if (sortedAr[0] == 'C') {
                Sol[i] = 2;
            }
            if (sortedAr[0] == 'G') {
                Sol[i] = 3;
            }
            if (sortedAr[0] == 'T') {
                Sol[i] = 4;
            }
        }
//            if((S.substring(P[i], Q[i] + 1)).contains(String.valueOf('A'))) {
//                Sol[i] = 1;
//                continue;
//            }
//            if((S.substring(P[i], Q[i] + 1)).contains(String.valueOf('C'))) {
//                Sol[i] = 2;
//                continue;
//            }
//            if((S.substring(P[i], Q[i] + 1)).contains(String.valueOf('G'))) {
//                Sol[i] = 3;
//                continue;
//            }
//            if((S.substring(P[i], Q[i] + 1)).contains(String.valueOf('T'))) {
//                Sol[i] = 4;
//                continue;
//            }
        return Sol;
    }
}
