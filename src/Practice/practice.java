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

        //problemOne();
        //problemTwo()
        
        
    }

    public static void problemOne(){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three integers: ");
        int firstNum = input.nextInt();
        int secondNum = input.nextInt();
        int thirdNum = input.nextInt();
        int highest = 0;
        int middle = 0;
        int lowest = 0;
        
        if (firstNum > secondNum && secondNum > thirdNum){
            
            highest = firstNum;
            middle = secondNum;
            lowest = thirdNum;

        }
        else if (firstNum > thirdNum && thirdNum > secondNum){
            
            highest = firstNum;
            middle = thirdNum;
            lowest = secondNum;

        }else if (secondNum > firstNum && firstNum > thirdNum){
            
            highest = secondNum;
            middle = firstNum;
            lowest = thirdNum;

        }else if (secondNum > thirdNum && thirdNum > firstNum){
            
            highest = secondNum;
            middle = thirdNum;
            lowest = firstNum;

        }else if (thirdNum > firstNum && firstNum > secondNum){
            
            highest = thirdNum;
            middle = firstNum;
            lowest = secondNum;

        }else if (thirdNum > secondNum && secondNum > firstNum){
            
            highest = thirdNum;
            middle = secondNum;
            lowest = firstNum;
            
        }
        
        System.out.println("Lowest to highest: "+ lowest +", "+ middle +", "+ highest);
        System.out.println("Highest to lowest: "+ highest +", "+ middle +", "+ lowest);
        System.out.println(" ");
        
    }

    public static void problemTwo(){
        
        
        
    }
}
