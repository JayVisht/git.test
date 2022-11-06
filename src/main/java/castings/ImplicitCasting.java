package castings;

public class ImplicitCasting {

    public static void main(String[] args) {
//     implicit (automatic) casting is done Automatically ,when data types are bigger
//        byte > short > int > long > float >double
        short x = 2;
        int y= x+1;
        System.out.println(y);

         double a = 1.1;
         double b = a+ 3; // automatically convert 3.0
        System.out.println(b);



    }



}
