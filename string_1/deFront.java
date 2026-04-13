public class deFront {
    public static void main(String[] args) {
        
    }
    public String deFront_(String str) {    
        if (str.length() > 1){
            if (!str.substring(0,1).equals("a")){
            str = str.substring(1);
            if (!str.substring(0,1).equals("b")){
                str = str.substring(1);
            }
            }
            else if (!str.substring(1,2).equals("b")){
                str = str.substring(0,1) + str.substring(2);
            }
        }
        else if(str.length() == 1){
            if (!str.equals("a")){
            str = "";
            }
            else if (!str.equals("b")){
                str = "";
            }
        }
        return str;
    }
}
