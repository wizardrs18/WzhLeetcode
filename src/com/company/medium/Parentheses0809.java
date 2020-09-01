package com.company.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Parentheses0809 {
    List<String> list=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        Stack<Integer> stack=new Stack<>();
//        for(int i=0;i<2*n;i++){
//            if(!stack.empty())
//        }
        stringMake(n,"",stack);
        return list;
    }

    private void stringMake(int n, String s,Stack<Integer> stack) {
        if(n==0 && stack.empty()){
            list.add(s);
            return;
        }
        if(!stack.empty()){
            Stack<Integer> stack1 = (Stack<Integer>) stack.clone();
            stack1.pop();
            stringMake(n, s + ")", stack1);
        }
        if(n!=0) {
            Stack<Integer> stack1= (Stack<Integer>) stack.clone();
            stack1.push(1);
            stringMake(n-1,s+"(",stack1);
//        }else{
//            Stack<Integer> stack1= (Stack<Integer>) stack.clone();
//            Stack<Integer> stack2= (Stack<Integer>) stack.clone();
//            stack1.push(1);
//            stack2.pop();
//            stringMake(n-1,s+"(",stack1);
//            stringMake(n,s+")",stack2);
//        }
        }
    }
}
