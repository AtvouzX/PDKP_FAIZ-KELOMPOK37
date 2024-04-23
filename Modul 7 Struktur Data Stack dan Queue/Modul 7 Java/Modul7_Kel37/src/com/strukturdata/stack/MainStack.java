package com.strukturdata.stack;

public class MainStack {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push("Apel");
        stack.push("Belimbing");
        stack.push("Manggis");
        stack.push("Durian");
        stack.push("Sirsak");
        stack.peek();
        stack.count();
        stack.printStack();

        System.out.println();

        stack.pop();
        stack.pop();
        stack.peek();
        stack.count();
        stack.printStack();

        stack.clear();
        stack.printStack();

    }

}
