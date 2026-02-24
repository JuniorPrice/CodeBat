import java.util.Scanner;

public class backAround {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(backAround_(string));
        sc.close();
    }

    public static String backAround_(String str) {
        String s = str.substring(str.length() - 1);
        return s+str+s;
    }   
}
