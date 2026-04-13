public class withoutX {
    public static void main(String[] args) {
        
    }
    public String withoutX_(String str) {
        if (str.length()>1){
            if (str.substring(0,1).equals("x")){
            str = str.substring(1);
            }
            if (str.substring(str.length()-1).equals("x")){
            str = str.substring(0,str.length()-1);
            }
        }
        else if (str.equals("x")){
            str = "";
        }
        return str;
    }
}