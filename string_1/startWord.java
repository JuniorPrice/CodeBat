public class startWord {
    public static void main(String[] args) {
        
    }
    public String startWord_(String str, String word) {
        if(str.length()>2){
            if (word.length()>1 && str.substring(1,word.length()).equals(word.substring(1))){
            return str.substring(0,word.length());
            }
            else if (str.substring(1,2).equals(word)){
            return str.substring(0,1);
            }
            return "";
        }
        else if (str.length() == 1){
            if (word.length() == 1){
            return str;
            }
        }
        return "";
    }
}
