package com.codility.tasks.lesson3;

public class FrogJmp{
    public int solution(int X, int Y, int D) {

        if((Y - X) % D == 0) {
            return (Y - X) / D;
        } else {
            return (Y - X) / D  + 1;
        }
    }
}
