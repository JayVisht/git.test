package castings;

public class WrapperClass {

    public static void main(String[] args) {
        // when non-compatible data-types present
        // converting String to int by wrapper class

        String s = "1";
        int x = Integer.parseInt(s) + 3;
        System.out.println( x );

        String a = "1.1";
        float b = Float.parseFloat(a) +4 ;
        System.out.println(b);

    }


}
