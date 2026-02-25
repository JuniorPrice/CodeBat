import java.util.Scanner;

public class everyNth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.nextLine();
        System.out.print("Enter a Nth steps number: ");
        int n = scan.nextInt();
        System.out.println("the string of ("+n+"th) steps is: "+everyNth_(str,n));
        scan.close();
    }

    public static String everyNth_(String str, int n) {
        String newString = "";
        for (int i = 0 ; i < str.length() ; i=i+n){
            newString = newString + str.charAt(i);
        }
        return newString;
    }

    
}
