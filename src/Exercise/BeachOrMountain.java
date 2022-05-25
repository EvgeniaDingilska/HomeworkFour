package Exercise;

import java.util.Scanner;

public class BeachOrMountain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String destination;
        double price;

           System.out.println("Please write a 'b' for beach and 'm' for mountain:");
           destination = scanner.nextLine();

           System.out.println("Please write a price:");
           price = scanner.nextDouble();

        if (destination.equals("m") || destination.equals("b") || price > 0)
        {
            switch (destination) {
                case "b":
                    if (price <= 50)
                    {
                        System.out.println("We recommended Bulgaria");
                    } else
                    {
                        System.out.println("We recommended outside of Bulgaria");
                    }
                    break;

                case "m":
                    if (price <= 30)
                    {
                        System.out.println("We recommended Bulgarian mountain");
                    } else
                    {
                        System.out.println("We recommended outside of Bulgaria");
                    }
                    break;
            }
        }
       else
       {
            System.out.println("There is no information about this type of vacation");
        }
    }
}
