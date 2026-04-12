public class conCat {
    public static void main(String[] args) {
        
    }
    public String conCat_(String a, String b) {
        if (a.substring(a.length()-1).equals(b.substring(0,1))){
            return a+ b.substring(1);
        }
        return a+b;
    }
}
