package com.rohan.StackImplement;

import com.rohan.inter.Stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> implements Stack{
    T inputStack[];
    int tos=0;
    @SuppressWarnings("unchecked")
    MyStack(int a){
        inputStack=(T[])new Object[a];
    }

    @Override
    public void push(Object element) {
    inputStack[tos++]=(T)element;
    }

    @Override
    public Object pop() {
        return inputStack[tos--];
    }
    public void popAll(){
        for(T x : inputStack){
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        MyStack<Integer> integerStack=new MyStack<>(10);
        for(Integer i=0;i<10;i++)
        integerStack.push(i);
        integerStack.popAll();

    }
}
