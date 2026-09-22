/*
*
Problem Description
You are given a function isalpha() consisting of a character array A.
Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
Problem Constraints
1 <= |A| <= 105
Input Format
Only argument is a character array A.
Output Format
Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.
Example Input
Input 1:
 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
Input 2:
 A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
¨C49C
Example Output
Output 1:
 1
Output 2:
 0
Example Explanation
Explanation 1:
 All the characters are alphanumeric.
Explanation 2:
 All the characters are NOT alphabets i.e ('#').
*
*/
import java.util.*;

public class alphaNumeric {

    public static void main(String[] args) {
        char[] A = /*{'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};*/{'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        int s = 1;
        for(char c:A){
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')){}
              //  s *= 1;
            else {
                s = 0;
                break;
            }
        }
            System.out.println(s);
    }
}
