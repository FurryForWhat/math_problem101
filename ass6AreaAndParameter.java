import java.util.Scanner;

public class ass6AreaAndParameter {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter radius to find Area and Parameter of a circle:");
    double r = scan.nextDouble();
    double area = Math.PI * Math.pow(r,2);
    double parameter = 2 * Math.PI * r;

    System.out.printf("Area: %.2f\nParameter: %.2f",area,parameter);
}
}
