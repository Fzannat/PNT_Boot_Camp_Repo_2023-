package com.programming.level2;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("Factorial of "+ number + " is " +calculateFactorial(number));

    }
    public static int calculateFactorial(int number){
        int factorialOfANum = 0;
        if(number == 0 || number == 1){
            return 1;
        }else{
            factorialOfANum = number * (calculateFactorial(number-1));
            // calling the method inside its own code block is called recursion
            return factorialOfANum;
        }
    }

}
