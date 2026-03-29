import java.util.Scanner;

public class mixStart{
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(mixStart_(string));
        sc.close();
    }
    public static boolean mixStart_(String str) {
        if (str.length()>2 && str.substring(1 , 3).equals("ix")){
            return true;
        }
        return false;
    }
}