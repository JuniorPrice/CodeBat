public class theEnd {
    public static void main(String[] args) {
        
    }
    public String theEnd_(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        }
        else {
            return str.substring(str.length()-1);
        }
    }
}
