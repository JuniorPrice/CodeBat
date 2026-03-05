public class max1020 {
    public static void main(String[] args) {
        
    }
    public int max1020_(int a, int b) {
        if (a>=10 && a<=20 && b>=10 && b<=20){
            if (a>b){
            return a;
            }
            return b;
        }
        if (a>=10 && a<=20){
            return a;
        }
        if (b>=10 && b<=20 ){
            return b;
        }
        return 0;
    }
}
