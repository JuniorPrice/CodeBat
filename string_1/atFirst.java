public class atFirst {
    public static void main(String[] args) {
        
    }
    public String atFirst_(String str) {
        if (str.length()>1){
            return str.substring(0,2);
        }
        if (str.length() ==1){
            return str +"@";
        }
        return "@@";
        }
}
