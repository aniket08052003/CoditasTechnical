public class code1{
    public static boolean prime(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void print(int n){
        boolean []prime = new boolean[n+1];
        for(int i=2;i*i<=n;i++){
            if(prime[i]==false){
                for(int j=i*i;j<=n;j=j+i){
                    prime[j] = true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==false){
                System.out.println(i);
            }
        }
    }

    public static void fib(int n){
        int first=0;
        int second =1;
        for(int i=0;i<n;i++){
            System.out.println(first+" ");
            int next = first+second;
            first = second;
            second = next;
        }
    }

    public static boolean ispal(int n){
        int num =n;
        int remainder;
        int reverse=0;
        while(n!=0){
            remainder = n%10;
            reverse = reverse * 10 + remainder;
            n /= 10;
        }
        return num==reverse;
    }

    public static int arm(int n){
        int num = n;
        int noOfDigit = String.valueOf(n).length();
        int sum =0;
        while(n != 0){
            int digit = n%10;
            sum += Math.pow(digit,noOfDigit);
            n /= 10;
        }
        return sum;
    }

    public static int gcd(int a,int b){
        while(a!=0 && b!=0){
            if(a>b){
                a=a%b;
            }
            else{
                b = b%a;
            }
        }
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }

    static String DecimalTOBinary(int n){
        String b = "";
        while(n>=1){
            int x = n%2;
            n = n/2;
            b= x+b;
        }
        return b;
    }

    static int BinaryToDecimal(String b){
        int result = 0;
        int powof2 = 1;
        for(int i=b.length()-1;i>=0;i--){
            if(b.charAt(i)=='1'){
                result = result + powof2;
            }
            powof2 = powof2 * 2;
        }
        return result;
    }


    public static void main(String[] args) {

        // Check prime
        // int n=5;
        // int arr[] = {2,3,4,5,6,7,8,9};
        // for(int e: arr){
        //     if(prime(e)){
        //         System.out.println(e);
        //     }
        // }
        // System.out.println(prime(n));

        // print prime
        // int n=10;
        // print(n);

        // Fibonacci
        // int n=10;
        // fib(n);

        // Palindrome
        // int n=121;
        // System.out.println(ispal(n));

        // Armstrong
        // int n=153;
        // System.out.println(arm(n));

        // gcd
        // int a=15;
        // int b=20;
        // System.out.println(gcd(a, b));
        // System.out.println(a*b/gcd(a, b));

        // Decimal to binary
        // int n = 10;
        // System.out.println(DecimalTOBinary(n));
    }
}