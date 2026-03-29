public class frontBack {
    public static void main(String[] args) {
        
    }
    public String frontBack_(String str) {
        if (str.length() <= 1) return str;
        
        String second = str.substring(1, str.length()-1);
        
        return str.charAt(str.length()-1) + second + str.charAt(0);
    }
}
