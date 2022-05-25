package Exercise;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {

        int count = 0 , max;
        int[] numbers = new int[10];


        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Write " + (count+1) +" numbers:");
            numbers[count] = scanner.nextInt();
            count++;
        }while (count<=numbers.length-1);

        max = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > max)
            {
                max = numbers[i];
            }

        System.out.println("Max number is:" + max);
    }
}
