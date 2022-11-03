package strings;

public class Manipulation {
    public static void main(String[] args) {
        String str = "     Hello World     ";
        System.out.println(str);
        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str.indexOf("World"));
        System.out.println(str.replace("World","Sky"));

    }



}
