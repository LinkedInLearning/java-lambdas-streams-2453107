package com.example;

import java.util.Random;

public class Main {

  public static void main(String[] args) {

    Greeting greeting = new HelloWorldGreeting();
    greeting.sayHello();

    Greeting greeting2 = new Greeting() {
      @Override
      public void sayHello() {
        System.out.println("Hello World");
      }
    };
    greeting2.sayHello();

    Greeting greeting3 = () -> System.out.println("Hello World");
    greeting3.sayHello();

    Calculator calculator = (x, y) -> {
      Random random = new Random();
      int randomNumber = random.nextInt(50);
      return x * y + randomNumber;
    };

    System.out.println(calculator.calculate(1, 2));


  }

}
