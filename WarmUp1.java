public class WarmUp1 {
    public static void main(String[] args) {
        System.out.println("sleepIn(false, false) →"+ sleepIn(false, false));
        System.out.println("sleepIn(true, false) →" + sleepIn(true, false));
        System.out.println("sleepIn(false, true) →" + sleepIn(false, true));
        System.out.println("sleepIn(true, true) →" + sleepIn(true, true));
    }

    //SleepIn
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation){
            return true;
        }
        else {
            return false;
        }
    }

}
