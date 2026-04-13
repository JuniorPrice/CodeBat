public class withoutX2 {
    public static void main(String[] args) {
        
    }
    public String withoutX2_(String str) {
        if (str.length()>1 && str.substring(0,1).equals("x")){
            str = str.substring(1);
            if (str.substring(0,1).equals("x")){
            str = str.substring(1);
            }
        }
        else if(str.length()>1 && str.substring(1,2).equals("x")){
            str = str.substring(0,1) + str.substring(2);
        }
        else if (str.length()==1 && str.substring(0,1).equals("x")) {
            str = "";
        }
        return str;
    }
}
