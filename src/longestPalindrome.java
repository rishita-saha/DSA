//length of longest palindrom


public class longestPalindrome {
    public static int longPal(String s){
        int ans=0,n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(palindromeString.isPalindrome(s,i,j)){
                    ans = Math.max(ans,j - i + 1);

                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longPal("chsmadamgsd"));
    }

}
