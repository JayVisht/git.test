package TheMathClass;

public class RandomMethod {

    public static void main(String[] args) {
        //generating random valve between 0 to 1 (everytime it will be different number on runtime)

       double result=Math.random(); //this mthd accepts double
        System.out.println(result);

        // generating no. from 0 to 100, simply multiply with 100

        double result2=Math.random()*100;
        System.out.println(result2);

        // dnt want no after the decimal point, we can either round it or cast it to in

        double result3= Math.round(Math.random()*100); //double will have fraction we can change to int
        System.out.println(result3);

       //if no fraction than
        int result4= (int)Math.round(Math.random()*100); //upcast from int to float
        System.out.println(result4);

//    removing Math.round as int is whole number
        int result5= (int)(Math.random()*100); //upcast from int to float
        System.out.println(result5);
    }

}
