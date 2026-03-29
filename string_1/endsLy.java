public class endsLy {
    public static void main(String[] args) {
        
    }
    public boolean endsLy_(String str) {
        if(str.length()<2){
            return false;
        }
        return str.substring(str.length()-2).equals("ly");
    }
}
