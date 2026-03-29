public class startOz {
    public static void main(String[] args) {
        
    }
    public String startOz_(String str) {
        String newString = "" ;
        if (str.length() > 0 && str.charAt(0) == 'o'){
            newString = newString + str.charAt(0);
        }
        if (str.length() > 1 && str.charAt(1) == 'z'){
            newString = newString + str.charAt(1);
        }
        return newString;
    }

}
