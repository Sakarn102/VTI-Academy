package Assignment_Lesson_7;

import java.util.Stack;

public class MyStack {
    protected Stack<Integer> stack = new Stack<>();

    public MyStack(){
        stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
    }

    public void deleteItem(int index){
        if(index < 0 || index >= stack.size()){
            System.out.println("Invalid index!");
        }
        else{
            int removedItem = stack.remove(index);
            System.out.println("Removed item at index: " + index + ": " + removedItem);
        }
    }

    public void showNumberOfItems(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            System.out.println("Number of items in the stack: " + stack.size());
        }
    }

    public void showMinItem(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            int min = stack.peek();
            for (int value : stack) {
                if(value < min){
                    min = value;
                }
            }
            System.out.println("Minimal value in the stack: " + min);
        }
    }

    public void showMaxItem(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            int max = stack.peek();
            for (int value : stack) {
                if(value > max){
                    max = value;
                }
            }
            System.out.println("Minimal value in th stack: " + max);
        }
    }

    public void findItem(int value){
        if(stack.contains(value)){
            System.out.println("Found item with value " + value + " int the stack!");
        }
        else{
            System.out.println("Cannot find item with value " + value + " in the stack!");
        }
    }

    public void printAllItems(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty!");
        }
        else{
            System.out.println(stack);
        }
    }

    public void exitProgram(){
        System.out.println("Exitting program...");
        System.out.println("Success!");
        System.exit(0);
    }
}