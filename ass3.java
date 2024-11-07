import java.lang.Math.*;
import java.util.Scanner;

public class ass3 {
    public static void main(String[] args){
        double shortOne,shortTwo;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length of side a:");
        double a = scan.nextDouble();

        System.out.print("Enter the length of side b:");
        double b = scan.nextDouble();

        System.out.print("Enter the length of side c:");
        double c = scan.nextDouble();
        if(validTri(a,b,c)){
            double angleA =calcAngle(b,c,a);
            double angleC =calcAngle(a,b,c);
            double angleB =calcAngle(a,c,b);

            System.out.printf("The angles of the triangle are: %.2f, %.2f, %.2f\n",angleA,angleB,angleC);
        }else{
            System.out.println("Invalid Triangle");
        }
        scan.close();

    }

    public static boolean validTri(double a,double b, double c){
        return  a+b>c && b+c> a && c+a>b;
    }

    public static double calcAngle(double s1, double s2, double oppo){
        double angle = Math.acos((s1*s1+s2*s2-oppo*oppo)/ (2*s1*s2));
        return Math.toDegrees(angle);
    }
}
