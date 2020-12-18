import java.util.Objects;
import java.util.Scanner;
import java.lang.Float;

public class LineComparison {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter co-ordinates(x1, y1) of point A of line1: ");
        float x1 = scanner.nextInt();
        float y1 = scanner.nextInt();
        System.out.println("Enter co-ordinates(x2, y2) of point B of line1: ");
        float x2 = scanner.nextInt();
        float y2 = scanner.nextInt();

        float x = (float) Math.pow((x2 - x1),2);
        float y = (float) Math.pow((y2 - y1), 2);
        Float length1 = (float) Math.sqrt(x + y);
        System.out.println("The length of the line1 = "+length1);

        System.out.println("Enter co-ordinates(x1, y1) of point A of line2: ");
        float xx1 = scanner.nextInt();
        float yy1 = scanner.nextInt();
        System.out.println("Enter co-ordinates(x2, y2) of point B of line2: ");
        float xx2 = scanner.nextInt();
        float yy2 = scanner.nextInt();

        float xx = (float) Math.pow((xx2 - xx1),2);
        float yy = (float) Math.pow((yy2 - yy1),2);
        Float length2 = (float) Math.sqrt(xx + yy);
        System.out.println("The length of the line2 = "+length2);


        if (length1.compareTo(length2) == 0) {
            System.out.println("line1 is equal to line2 in length");
        } else if (length1.compareTo(length2) < 0) {
            System.out.println("line1 is shorter than line2 in length");
        } else {
            System.out.println("line1 is longer than line2 in length");
        }

        if (Objects.equals(length1, length2)) {
            System.out.println("Two lines are equal in length");
        } else {
            System.out.println("Two lines are not equal in length");
        }

    }
}
