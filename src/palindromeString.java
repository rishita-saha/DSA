public class palindromeString {
    //using two pointer

    public static boolean isPalindrome(String str,int s,int e) {
        while(s<e){
            if(str.charAt(s) == str.charAt(e)){
                s++;
                e--;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("a",0,0));
    }
}
