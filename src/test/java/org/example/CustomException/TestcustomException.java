package org.example.CustomException;

public class TestcustomException {


    public static void  testCustomException() {
        try {
            int age = 17;
            if (age < 18) {
                throw new CustomException("Not eligible to vote");
            } else {
                System.out.println("Eligible to Vote");
            }
        } catch (CustomException e) {
            System.out.println("Exception caught: " + e);
        }
    }
     public static void main(String[] args) {
         testCustomException();
    }
}