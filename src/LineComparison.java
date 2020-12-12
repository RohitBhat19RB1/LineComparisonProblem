import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        System.out.println("Enter co-ordinates(x1, y1) of point A of line: ");
        float x1 = scanner.nextInt();
        float y1 = scanner.nextInt();
        System.out.println("Enter co-ordinates(x2, y2) of point B of line: ");
        float x2 = scanner.nextInt();
        float y2 = scanner.nextInt();

        float x = (float) Math.pow((x2 - x1),2);
        float y = (float) Math.pow((y2 - y1), 2);
        float length = (float) Math.sqrt(x + y);
        System.out.println("The length of the line = "+length);
    }
}
