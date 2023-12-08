package com.sparta.cw;

public class FizzBuzz
{
    public static void fizzbuzz(){
        for(int i = 1; i<=30; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    public static String fizzBuzzCheckNumber(int i){

        if(i%3==0 && i%5==0){
            return "FizzBuzz";

        } else if (i%3==0) {
            return "Fizz";
        } else if (i%5==0) {
            return "Buzz";
        }else {
            System.out.println(i);
        }

        return "Thats not a fizz or buzz";
    }

}
