package packageone;

public class FirstLetterToUpperCase {
    public static String toUpperLetter (String str){
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i - 1) == ' ' && str.charAt(i) != ' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String str = "hi, i am rishav";
        System.out.println(toUpperLetter(str));
    }
}
