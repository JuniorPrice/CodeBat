public class missingChar {
    public static void main(String[] args) {
        String str = "Hello";
        int n = 1;
        System.out.println(missingChar_(str, n));
    }

    public static String missingChar_(String str, int n) {

        String front = str.substring(0, n);
        
        // Start this substring at n+1 to omit the char.
        // Can also be shortened to just str.substring(n+1)
        // which goes through the end of the string.
        String back = str.substring(n+1, str.length());
        
        return front + back;
        
    } 
}
