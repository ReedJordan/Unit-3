package math_class;

/**
 * https://docs.oracle.com/en/java/javase/19/docs/api/java.base/java/lang/Math.html
 */

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //using math class which is a static class
        //static things (methods and variables) belong to the class rather than
        //objects (instance of the class)
        //we don't need to create an object since Math class is static
        // ClassName.methodName(); e.g. Math.random()
        // ClassName.staticVariableName(); e.g. Math.PI

        double myPI = Math.PI;


        // abs
        int num1 = -2;
        System.out.println(Math.abs(num1));

        // pow
        double num2 = Math.pow(3,5);
        System.out.println((int)num2);

        // sqrt
        double num3 = Math.sqrt(81);
        System.out.println(num3);
        System.out.println(Math.pow(num3,2));


        //create a random integer in the range [0,1)
        double random1 = (int) Math.random();
        System.out.println(random1);

        //create a random integer in the range [0, n)
        //Ex: n = 6
        double random2 = (int) (Math.random() * 6);
        System.out.println(random2);
        //in general, just multiply by n

        // create a random number in the range [0,n]
        //Ex: n = 6
        double random3 = (int) (Math.random()*7);

        //For Homework

        // 1) Create a random number in the range [m,n]
        // m = 4, n = 11
        double hw1 = (Math.random() * 7) + 4;
        System.out.println(hw1);
        
        
        // 2) Create a random negative integer in the range [-m,0]
        // m = -4
        double hw2 = (int) (Math.random() * (-4));
        System.out.println(hw2);
        
        // 3) Create a random negative integer in the range [-m,-n]
        // m = -7, n = -3
        double hw3 = (int) ((Math.random() * (-4)) - 3);
        System.out.println(hw3);
        
        // 4) Create a random negative integer in the range [-m,n]
        // m = -7, n = 2
        double hw4 = (int) ((Math.random() * (-9)) + 2);
        System.out.println(hw4);



        //using the Random Class
        //This is not static so we have to create a Random object

        //create a Random object

        //get int with and without bound

        // get double





    }
}
