import java.util.Scanner;

public class ass1 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("First angle:");
        int first = scan.nextInt();
        System.out.print("Second angle:");
        int second = scan.nextInt();
        int third = 180-(first+second) ;
        System.out.println("The third angle is:"+third);
    }
}
