import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // 1. Find rectangle area
        int length = 5, width = 3;
        int results = length * width;

        System.out.println("No.1 " + results);

        // 2. Circle
        int rad = 5;
        double pi = Math.PI;

        int d = rad * 2;
        double circum = pi * d;
        double area = pi * Math.pow(rad, 2);

        System.out.println("No. 2");
        System.out.println(d);
        System.out.println(circum);
        System.out.println(area);

        // 3. Triangle
        int total = 180, a = 80, b = 65;
        int c = total - (a + b);

        System.out.println("No. 3 " + c);

        // 4. Date
//        LocalDate input1 = LocalDate.of(2024,3,19);
//        LocalDate input2 = LocalDate.of(2024, 3, 21);
//
//        Period period = Period.between(input1, input2);
//        int daysDiff = period.getDays();
//
//        System.out.println("No. 4 " + daysDiff + " days");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Start Date");
        String startDate = scanner.nextLine();
        System.out.println("End Date");
        String endDate = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parsedStartDate = LocalDate.parse(startDate, formatter);
        LocalDate parsedEndDate = LocalDate.parse(endDate, formatter);
        long daysDifference = ChronoUnit.DAYS.between(parsedStartDate, parsedEndDate);

        System.out.println("No. 4 " + daysDifference);

        // 5. Initial Name
        String name = "Rizaldy Iman Putra";
        String[] names = name.split(" ");

        System.out.print("No. 5 ");
        for (String s : names) {
            String initial = "";
            initial += s.charAt(0);
            System.out.print(initial);
        }

    }
}
