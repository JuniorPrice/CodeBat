public class posNeg {
    public static void main(String[] args) {
        
    }
    public boolean posNeg_(int a, int b, boolean negative) {
        if (negative && a<0 && b<0){
            return true;
        }
        if (!negative && ((a<0 && b>-1) || (a>-1 && b<0))){
            return true;
        }
        return false;
    }

    
}
