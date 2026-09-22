package Recurtion;

public class power {
    static int pow(int a,int n){
        if(n==0)
            return 1;
        else
            return a*pow(a,n-1);
    }
    static int pow2(int a, int n){
        if(n==0)
            return 1;
        int half = pow(a,n/2);
        if(n%2 == 0)
            return half*half;
        else
            return a*half*half;
    }
    public static void main(String[] args) {
        System.out.println(pow2(2,5 ));
    }
}
