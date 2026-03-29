import java.util.Scanner;

public class hasTeen {
    public static void main(String[] args) {
        System.out.print("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(hasTeen_(a , b , c));
        sc.close();
    }
    public static boolean hasTeen_(int a, int b, int c) {
        if (a>12 && a<20 || b>12 && b<20 || c>12 && c<20){
            return true;
        }
        return false;
    }
}
