public class twoChar {
    public static void main(String[] args) {
        
    }
    public String twoChar_(String str, int index) {
        if (index < 0 || index+2 > str.length()){
            return str.substring(0,2);
        }
        return str.substring(index, index+2);
    }
}
