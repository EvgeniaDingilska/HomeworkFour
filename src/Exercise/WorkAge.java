package Exercise;

import java.util.Scanner;

public class WorkAge {
    public static void main(String[] args) {

        int age;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please write your age:");
        age = scanner.nextInt();

        if (age > 16 && age <= 102)
        {
            System.out.format("The age %d is enough for work", age);
        }

        System.out.println("The age that you write is not enough for work");
    }
}
