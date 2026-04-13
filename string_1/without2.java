public class without2 {
    public static void main(String[] args) {
        
    }
    public String without2_(String str) {
        if (str.length()>1 && str.substring(0,2).equals(str.substring(str.length()-2))){
            return str.substring(2);
        }
        return str;
    }
}
