package formattingnumbers;

public class NumberFormat {

    public static void main(String[] args) {
//        NumberFormat is an abstract;cannot be instantiated
       // NumberFormat currency = new NumberFormat()
    // used to format the number in currency
        java.text.NumberFormat currency=java.text.NumberFormat.getCurrencyInstance();
        String result= currency.format(123456.817);
        System.out.println(result);

//    get PercentInstance
        java.text.NumberFormat percent=java.text.NumberFormat.getPercentInstance();
        String result1=percent.format(0.1);
        System.out.println(result1);

//   method chaining method can be used for percentage too
        String result2=java.text.NumberFormat.getPercentInstance().format(1.1);
        System.out.println(result2);

    }

}
