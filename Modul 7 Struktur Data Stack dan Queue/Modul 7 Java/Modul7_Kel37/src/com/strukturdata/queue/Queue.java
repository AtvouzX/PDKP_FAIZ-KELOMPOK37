package com.strukturdata.queue;

public class Queue {
    private Object[] data;
    private int front;
    private int rear;
    private int capacity;
    private int count;
    public Queue(int size){
        data = new Object[size];
        capacity = size;
        rear = -1;
        front = 0;
        count = 0;
    }
    public boolean isFull(){
        return count == capacity;
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public void enqueue(Object x){
        if(isFull()){
            System.out.println("Queue Penuh!!!");
        }else{
            System.out.println("Memasukkan " + x + " Ke Dalam Queue");
            rear = (rear + 1) % capacity;
            data[rear] = x;
            count++;
        }
    }
    public Object dequeue(){
        if(isEmpty()){
            System.out.println("Queue Kosong!!!");
            return 0;
        }
        Object x = data[front];
        System.out.println("Mengeluarkan " + x + " Dari Queue");
        front = (front + 1) % capacity;
        count--;
        return x;
    }
    public void printQueue(){
        if(isEmpty()){
            System.out.println("Queue Kosong!!!");
        }else{
            System.out.print("Data Dalam Queue : ");
            for(int i = 0; i < count ; i++){
                System.out.print(data[(front + i) % capacity] + " ");
            }
            System.out.println();
        }
    }
    public void peek(){
        if(isEmpty()){
            System.out.println("Queue Kosong!!!");
        }else{
            System.out.println("Elemen Depan : " + data[front]);
        }
    }
    public void count(){
        System.out.println("Jumlah Data Dalam Queue : " + count);
    }

}
