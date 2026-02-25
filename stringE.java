import java.util.Scanner;

public class stringE {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(stringE_(string));
        sc.close();
    }

    public static boolean stringE_(String str) {
        int count = 0;
        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == 'e'){
            count ++;
            }
        }
        if (count > 0 && count < 4){
            return true;
            }
        return false;
    }

    
}
