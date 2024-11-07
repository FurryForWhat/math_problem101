import java.util.Scanner;

public class ass2pythagorean {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter base side length: ");
    double base = scan.nextDouble();
    System.out.print("Enter base side length: ");
    double height = scan.nextDouble();
    double result = Math.pow(base,2) + Math.pow(height,2);
   double hypo = Math.sqrt(result);
   System.out.printf("The hypotenuse is: %.2f units",hypo);
}
}
