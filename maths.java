import java.util.Scanner;

public class maths {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter an angle: ");
        double angle = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter another angle: ");
        double angle2 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter another angle: ");
        double angle3 = scan.nextInt();
        scan.nextLine();

        System.out.println("The sine of an angle with degree " + angle + " is " + Math.sin(angle));
        System.out.println("The cosine of an angle with degree " + angle2 + " is " + Math.cos(angle));
        System.out.println("The tangent of an angle with degree " + angle3 + " is " + Math.tan(angle));
        
        scan.close();
    }
}
