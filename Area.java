
package javaapplication1;

import java.util.Scanner;

public class Area {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double base,height,area;
        
        ///////////////////////////// Area of Triangle below///////////////////////////////////////////
        
        System.out.print("Enter Base = ");
        base = input.nextDouble();
        System.out.print("Enter Height = ");
        height = input.nextDouble();
        
        area = 0.5*base*height;
        System.out.println("Area of Triangle = "+area);
        
        ////////////////////////////// Area of Circle below//////////////////////////////////////////
        
        double radius,carea;
        
        System.out.print("Enter Base of circle = ");
        radius = input.nextDouble();
        
        carea = 3.1416*radius;
        System.out.println("Area of Triangle = "+carea);
        
        ////////////////////////////////// Area of Square Below //////////////////////////////////////
        
        double len, square;
        System.out.print("Enter Length = ");
        len = input.nextDouble();
        
        square = len*len;
        System.out.println("Square of Length = "+square);
        
        ///////////////////////////////// Area of Rectangular below //////////////////////////////////
        
        double rl,rw,rectan;
        
        System.out.print("Enter length = ");
        rl = input.nextDouble();
        System.out.print("Enter Width = ");
        rw = input.nextDouble();
        
        rectan = rl*rw;
        System.out.println("Area of Triangle = "+rectan);

        
        
    }
}
