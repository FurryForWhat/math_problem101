import java.util.Scanner;

public class ass4Anglew {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter side degree: ");
    double base = scan.nextDouble();

    double r = 180 -base;
    double result  = r / 2;
    System.out.printf("The size of then angle w is %.2f degrees",result);
    scan.close();
}
}
