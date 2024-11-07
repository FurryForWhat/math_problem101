import java.util.Scanner;

public class ass7SurfaceArea {
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter radius of cylinder: ");
    double r = scan.nextDouble();
    System.out.print("Enter height of cylinder: ");
    double h = scan.nextDouble();

    double area = cylinder_surface_area(r,h);
    System.out.printf("Area of Cylinder in two decimal place: %.2f",area);
}
public static double cylinder_surface_area(double radius, double height){
    double area = 2* Math.PI*radius *(radius + height);
    return  area;
}
}
