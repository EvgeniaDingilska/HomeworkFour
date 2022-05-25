package Exercise;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {

        double unitPrice, quantity, revenue, discount =0;
        double discountRateOne = 0.15;
        double discountRateTwo = 0.20;
        String percentage = "%";
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Please write a price:");
            unitPrice = scanner.nextDouble();

            System.out.println("Please write a quantity:");
            quantity = scanner.nextDouble();
        }while (unitPrice <= 0 || quantity <= 0);

        if (quantity>=100 && quantity<=120)
        {
            revenue = (unitPrice*quantity);
            discount = revenue*discountRateOne;
            System.out.format("The unit price:%.0f\n",unitPrice);
            System.out.format("The quantity:%.0f\n",quantity);
            System.out.format("The the revenue from sale:%.1f$\n",revenue-discount);
            System.out.format("Discount:%.1f$(%.0f%s)",discount,discountRateOne*100,percentage);
        } else if (quantity>120) {
            revenue = (unitPrice*quantity);
            discount = revenue*discountRateTwo;
            System.out.format("The unit price:%.0f\n",unitPrice);
            System.out.format("The quantity:%.0f\n",quantity);
            System.out.format("The the revenue from sale:%.1f$\n",revenue-discount);
            System.out.format("Discount:%.1f$(%.0f%s)",discount,discountRateTwo*100,percentage);
        }else
        {
            revenue = (unitPrice*quantity);
            System.out.format("The unit price:%.0f\n",unitPrice);
            System.out.format("The quantity:%.0f\n",quantity);
            System.out.format("The the revenue from sale:%.1f$\n",revenue-discount);
            System.out.format("Discount:%.1f$(%.0f%s)",discount,discount,percentage);
        }
    }
}
