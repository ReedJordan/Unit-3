package Practice; //don't change this


/*
Unit 3, lesson 6, practice problems
@Reed Jordan
AP Comp Sci A w/ Mr. Smith
10/26/24
*/

import java.util.Scanner;

public class practice{
    public static void main(String[] args){
        //remove the // to run the methods

        problemOne();
        
        
        //problemTwo()
        
        
    }

    public static void problemOne(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three integers: ");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();
        String highest = null;
        String middle = null;
        String lowest = null;
        
        
        
        if (firstNum > secondNum && secondNum > thirdNum){
            
            String highest = firstNum + ", ";
            String middle = secondNum + ", ";
            String lowest = thirdNum + ", ";

        }else if (firstNum > thirdNum && thirdNum > secondNum){
            
            String highest = firstNum + ", ";
            String middle = thirdNum + ", ";
            String lowest = secondNum + ", ";

        }else if (secondNum > firstNum && firstNum > thirdNum){
            
            String highest = secondNum + ", ";
            String middle = firstNum + ", ";
            String lowest = thirdNum + ", ";

        }else if (secondNum > thirdNum && thirdNum > firstNum){
            
            String highest = secondNum + ", ";
            String middle = thirdNum + ", ";
            String lowest = firstNum + ", ";

        }else if (thirdNum > firstNum && firstNum > secondNum){
            
            String highest = thirdNum + ", ";
            String middle = firstNum + ", ";
            String lowest = secondNum + ", ";

        }else if (thirdNum > secondNum && secondNum > firstNum){
            
            String highest = thirdNum + ", ";
            String middle = secondNum + ", ";
            String lowest = firstNum + ", ";
            
        }
        
        System.out.println("\nLowest to highest: "+ lowest + middle + highest);
        System.out.println("Highest to lowest: "+ highest+ middle+ lowest);
        
        
    }

    public static void problemTwo(){
        //code here
    }
}
