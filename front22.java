public class front22 {
    public static void main(String[] args) {
        
    }
    public String front22_(String str) {
        if (str.length() <2){
            return str + str + str;
        }
        return str.substring(0,2) + str + str.substring(0,2);
    }

}
