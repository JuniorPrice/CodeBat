public class lastTwo {
    public static void main(String[] args) {
        
    }
    public String lastTwo_(String str) {
        if (str.length()>1){
            return str.substring(0, str.length()-2) + str.substring(str.length()-1) + str.substring(str.length()-2, str.length()-1);
        }
        return str;
    }
}
