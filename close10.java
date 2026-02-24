import java.util.Scanner;

public class close10 {
    public static void main(String[] args) {
        System.out.print("Enter 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(close10_(a , b ));
        sc.close();
    }
    
    public static int close10_(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)){
        return a;
        }
        else if (Math.abs(a - 10) > Math.abs(b - 10)){
            return b;
        }
        return 0;
    }
}
