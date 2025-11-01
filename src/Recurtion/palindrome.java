package Recurtion;
import java.util.*;
public class palindrome {
    static boolean isPalindrome(String s,int l,int r) {
        if (l >= r)
            return true;

        if (s.charAt(l) == s.charAt(r) && isPalindrome(s, l + 1, r - 1)) {
                return true;
            }


        return false;
    }

    static boolean palindromeIte(String s){
        int l=0;
        int r = s.length()-1;
        while(l<=r){
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
       System.out.println("Enter a string: ");
       Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean t = palindromeIte(s);//isPalindrome(s,0,3);
        if(t)
            System.out.println("This is palindrome");
        else
            System.out.println("This is not  palindrome");

    }
}
