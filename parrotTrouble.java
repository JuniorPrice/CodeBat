public class parrotTrouble {
    public static void main(String[] args) {
        
    }
    public boolean parrotTrouble_(boolean talking, int hour) {
        if (talking && (hour < 7 || hour > 20)){
            return true;
        }
        return false;
    }

}
