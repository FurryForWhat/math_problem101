import java.util.Scanner;

public class ass5Quadratic {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter coefficients a, b, c:");
    String input = scan.nextLine();

    String[] values = input.split(",");
    double a = Double.parseDouble(values[0].trim());
    double b = Double.parseDouble(values[1].trim());
    double c = Double.parseDouble(values[2].trim());

    double validSqrt = Math.pow(b,2) - 4*c*a;

    if (validSqrt < 0) {
        System.out.print("Invalid input!!!");
    } else if (validSqrt == 0) {
        double result = -b / (2*a);
        System.out.printf("Answer: x = %.2f\n",result);
    }else {
        double x1 = ((-b + Math.sqrt(validSqrt))/ (2*a));
        double x2 = ((-b - Math.sqrt(validSqrt))/ (2*a));
        System.out.printf("The solutinos are: x1= %.2f, x2= %.2f\n",x1,x2);
    }
    scan.close();
}
}
