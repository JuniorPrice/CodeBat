public class withouEnd2 {
    public static void main(String[] args) {
        
    }
    public String withouEnd2_(String str) {
        if (str.length()<2){
            return "";
        }
        return str.substring(1,str.length()-1);
    }
}
