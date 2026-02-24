import java.util.Scanner;

public class startHi {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(startHi_(string));
        sc.close();
    }
    public static boolean startHi_(String str) {
        if (str.length()>1 && str.substring(0 , 2).equals("hi")){
            return true;
        }
        return false;
    }
}
