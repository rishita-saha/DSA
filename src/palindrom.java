import java.util.Scanner;

public class palindrom {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = s.nextInt();
        int l,r=0,x=n;
            while(x!=0){
                l=x%10;
                r=(r*10)+l;
                x/=10;
            }

        if(n==r)
            System.out.println("This is palindrom");
        else
            System.out.println("This is not palindrom");

    }
}
