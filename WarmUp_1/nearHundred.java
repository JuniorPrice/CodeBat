
import java.util.Scanner;

public class nearHundred {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scan.nextInt();
        System.out.println(nearHundred_(n));
        scan.close();
    }

    static boolean nearHundred_(int n) {
        return Math.abs(100 - n)<=10 || Math.abs(200 - n)<=10;
    }    
}
