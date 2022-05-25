package Exercise;

import java.util.Scanner;

public class ExerciseWeekDay {

    public static void main(String[] args) {

        int dayNumber;
        String daySuffix = "th";
        String dayOfWeek = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number between 1 and 7:");
        dayNumber = scanner.nextInt();

        switch (dayNumber){
            case 1:
                daySuffix = "st";
                dayOfWeek = "Monday";
                break;
            case 2:
                daySuffix = "nd";
                dayOfWeek = "Tuesday";
                break;
            case 3:
                daySuffix = "rd";
                dayOfWeek = "Wednesday";
                break;
            case 4:
                dayOfWeek = "Thursday";
                break;
            case 5:
                dayOfWeek = "Friday";
                break;
            case 6:
                dayOfWeek = "Saturday";
                break;
            case 7:
                dayOfWeek = "Sunday";
                break;
            default:
                System.out.println("This is not a valid day of the week");
        }

        if(dayNumber > 0 && dayNumber < 8) {
            System.out.format("The %d %s day of the week is %s", dayNumber, daySuffix, dayOfWeek);
        }
    }
}
