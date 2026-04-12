public class extraFront {
    public static void main(String[] args) {
        
    }
    public String extraFront_(String str) {
        if (str.length()>1){
            return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
        }
        return str + str + str;
    }
}
