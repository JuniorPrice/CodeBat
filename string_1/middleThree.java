public class middleThree {
    public static void main(String[] args) {
        
    }
    public String middleThree_(String str) {
        if (str.length() < 4){
            return str;
        }
        return str.substring(str.length()/2-1,str.length()/2+2);
    }
}
