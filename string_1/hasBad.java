public class hasBad {
    public static void main(String[] args) {
        
    }
    public boolean hasBad_(String str) {
        if (str.length()<3){
            return false;
        }
        if (str.length()==3){
            String str1 = str.substring(0,3);
            return str1.equals("bad");
        }
        if (str.length()>3){
            String str1 = str.substring(0,3);
            String str2 = str.substring(1,4);
            return str1.equals("bad") || str2.equals("bad");
        }
        return false;
    }

}
