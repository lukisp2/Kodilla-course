package com.kodilla.testing;


import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result = simpleUser.getUsername();
        simpleUser.add(3, 3);


        if (result.equals("theForumUser")) {
            System.out.println("Test ok");
        } else {
            System.out.println("Error!");
        }

        int a =5;
        int b =6;

        Calculator calculator = new Calculator();
      if(calculator.add(a,b) == a+b){
          System.out.println("Test dodawania ok");
        }  else {System.out.println("Test dodawania nie ok");}

        if(calculator.subtract(a,b) == a-b){
            System.out.println("Test odejmowania ok");
        }  else {System.out.println("Test odejmowania nie ok");}


   

    }
}
