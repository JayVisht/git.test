package readinginput;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;//where  we're going to read the file from
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("you are " + age);
//

        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.println("you are " + name);


    }

}
