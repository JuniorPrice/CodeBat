public class front3 {
    public static void main(String[] args) {
        
    }
    public String front3_(String str) {
        if (str.length() < 3){
            return str + str + str ;
        }
        return str.substring(0,3) + str.substring(0,3) + str.substring(0,3);
    }

}
