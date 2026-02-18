import java.util.Scanner;

public class diff21 {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("the diff21 of ("+n+") is: "+diff21(n));
        
    }

    static int diff21(int n) {
            if (n == 21){
                return 0;
            }
            else if (n < 21){
                return 21-n;
            }
            else{
                return 2*(n-21);
            }
        }
    
}