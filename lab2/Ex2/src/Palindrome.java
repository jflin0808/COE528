/**
 *
 * @author Jia fei Lin
 */
public class Palindrome {
    
    public static boolean isPalindrome(String a) {
        String reverse = "";
        String test = null;
        try{
            if(a.equals(reverse))
                return false;
            a.equals(test);
        }
        catch(NullPointerException ex) {
            return false;
        }
        for(int i = a.length() - 1; i >= 0; i--){
            reverse = reverse + a.charAt(i);
        }
        if(a.equals(reverse))
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        if(args.length == 1) {
            if (args[0].equals("1"))
                System.out.println(isPalindrome(null));
            else if (args[0].equals("2")) 
                System.out.println(isPalindrome(""));
            else if (args[0].equals("3")) 
                System.out.println(isPalindrome("deed"));
            else if (args[0].equals("4"))
                System.out.println(isPalindrome("abcd"));
        }
    }
}