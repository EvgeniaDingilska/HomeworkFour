package Exercise;

import java.util.Scanner;

public class WorkAge {
    public static void main(String[] args) {

        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        age = scanner.nextInt();

        if (age > 16 && age <= 102)
        {
            System.out.println("You are not eligible to work");
        }

        System.out.println("The age that you write is not enough for work");
    }
}
