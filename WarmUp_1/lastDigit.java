public class lastDigit {
    public static void main(String[] args) {
        
    }
    public boolean lastDigit_(int a, int b) {
        boolean con = true;
        while (con){
            if (a<10 && b<10 && a==b){
            return true;
            }
            if (a<10 && b<10 && a!=b){
            con = false;
            }
            a = a%10;
            b = b%10;
        }
        return false;
    }

}