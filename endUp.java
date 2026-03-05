public class endUp{
    public static void main(String[] args) {
        
    }
    public String endUp_(String str) {
        if (str.length() > 3){
        return str.substring(0,str.length()-3) + str.substring(str.length()-3,str.length()).toUpperCase();
        } 
        return str.toUpperCase();
    }
}