package com.strukturdata.stack;

public class Stack {
    private int capacity;
    private Object[]data;
    private int top;
    private int count;


    public Stack(int size){
        top = -1;
        data = new Object[size];
        capacity = size;
        count = 0;
    }

    public boolean isFull(){
        return top == capacity - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void push(Object x){
        if(isFull()){
            System.out.println("Stack Penuh!!!");
        }else{
            System.out.println("Memasukkan " + x + " Ke Dalam Stack");
            data[++top] = x;
        }
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack Kosong!!!");
            return 0;
        }
        System.out.println("Mengeluarkan " + data[top] + " Dari Stack");
        return data[top--];
    }

    public void printStack(){
        System.out.print("Data Dalam Stack : ");
        if(isEmpty()){
            System.out.println("Stack Kosong!!!");
        }else{
            for(int i = top; i >= 0; i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }




    public void peek(){
        if(isEmpty()){
            System.out.println("Stack Kosong!!!");
        }else{
            System.out.println("Data Teratas : " + data[top]);
        }
    }

    public void clear(){
        if(isEmpty()){
            System.out.println("Stack Kosong!!!");
        }else{
            top = -1;
        }
    }

    public void count(){
        System.out.println("Jumah Data Dalam Stack : " + (top + 1));
    }


}
