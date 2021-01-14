package com.codility.tasks.lesson7;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets {
    public int solution(String S) {
        if (S == null) {
            return 0;
        }
        if (S.isEmpty()) {
            return 1;
        }
        if (!(S.charAt(0) == '(' || S.charAt(0) == '[' || S.charAt(0) == '{')) {
            return 0;
        }
        Deque<Character> stack = new ArrayDeque<>();
        char character;
        for (int i = 0; i < S.length(); i++) {
            character = S.charAt(i);
            if (character == '(' || character == '[' || character == '{') {
                stack.push(character);
            } else if (character == ')' || character == ']' || character == '}') {
                if (stack.isEmpty()) {
                    return 0;
                }
                if ((character == ')' && stack.peek() == '(')
                        || (character == ']' && stack.peek() == '[')
                        || (character == '}' && stack.peek() == '{')) {
                    stack.pop();
                }
            } else {
                character = S.charAt(++i);
                while (!(character == '(' || character == '[' || character == '{'
                        || character == ')' || character == ']' || character == '}')) {
                    character = S.charAt(++i);
                }
                if (character == '(' || character == '[' || character == '{') {
                    return 0;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()) {
            return 1;
        }
        return 0;
    }
}
