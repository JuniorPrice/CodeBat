public class monkeyTrouble {
    public static void main(String[] args) {
        System.out.println("monkeyTrouble(true, true) → "+monkeyTrouble_(true, true));
        System.out.println("monkeyTrouble(false, false) → "+monkeyTrouble_(false, false));
        System.out.println("monkeyTrouble(true, false) → "+monkeyTrouble_(true, false));
        System.out.println("monkeyTrouble(false, true) → "+monkeyTrouble_(false, true));
    }
    public static boolean monkeyTrouble_(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile){
            return true;
        }
        return false;
    }

}
