public class notString {
    public static void main(String[] args) {
        
    }
    public String notString_(String str) {
        if (str.length()>2 && str.substring(0,3).equals("not")){
            return str;
        }
        return "not "+str;
    }

}
