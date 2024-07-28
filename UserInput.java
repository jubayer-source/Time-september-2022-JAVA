
package javaapplication1;

import java.util.Scanner;


public class UserInput {
    
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num1, num2, result;
        
        num1 = 30;
        num2 = 20;
       
        result = num1 + num2;
        System.out.println("sum = "+result);
        
        result = num1 - num2;
        System.out.println("sum = "+result);
        
        result = num1 * num2;
        System.out.println("sum = "+result);
        
        result = num1 / num2;
        System.out.println("sum = "+result);
        
        result = num1 % num2;
        System.out.println("sum = "+result);
        
        /*
        User Input Below
        */
        
        String name;
        System.out.print("Enter your Name: ");
        name = input.nextLine();
        System.out.println("Welcome: "+name);
        
        int number;
        System.out.print("Input any Number = " );
        number = input.nextInt();
        System.out.println("Out Number = "+number);
         
        
        double PNum;
        System.out.print("Your Phone Number: ");
        PNum = input.nextDouble();
        System.out.println
        ("Jubayer\'s Phone Number is :"+PNum);
        
        
       
        
        
    }
    
}
