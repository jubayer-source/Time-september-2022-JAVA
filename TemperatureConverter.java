
package javaapplication1;

import java.util.Scanner;


public class TemperatureConverter {
    
    public static void main(String[] args) {
        
        /*
        Scanner input = new Scanner(System.in);
        ///////////////////////////////////////////////////////////
        double cels,far;
        
        System.out.print("Enter Celcius value = ");
        cels = input.nextDouble();
        
        far = 1.8*cels + 32;
        System.out.println("Farenhit Value = "+far);
        
        
        
        /////////////////////////////////////////////////////
        
        double farh,cel;
        
        System.out.print("Enter Farenhit value = ");
        farh = input.nextDouble();
        
        cel = 0.5556 * (farh - 32);    
        System.out.print("Farenhit Value = "+cel);
        */
        
        Scanner input = new Scanner(System.in);
        
        double far, cel;
        System.out.print("Farenheit Value: ");
        far = input.nextDouble();
        
        cel = 0.556 * (far -32);
        System.out.println("Celcius Value: "+cel);
        
        
        
        double cels, farh;
        System.out.print("celcius input");
        cels = input.nextDouble();
        
        farh = 1.8*cels + 32;
        System.out.printf("farhenheit Value: "+farh);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
}
