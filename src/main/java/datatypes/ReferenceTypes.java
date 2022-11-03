package datatypes;

import java.awt.*;
import java.util.Date;

// also called as Non-Primitive Types
public class ReferenceTypes {

     public static void main(String[] args) {
         byte age = 30;
         Date now = new Date();   // this is an object define as instance of the class
         System.out.println(now);


             Point point1 = new Point(1, 1);
             Point point2 = point1;
             point1.x = 2;
             System.out.println(point2);


         }
     }




