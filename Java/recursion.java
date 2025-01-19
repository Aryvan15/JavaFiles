// Q1- Get the sum of the first n numbers
public class recursion {
    public static void getsum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println("The sum of the n numbers is: "+sum);
            return;
        }
        sum += i;
        getsum(i+ 1, n, sum);
    }
// Q2- Print factorial of a number;
        public static int getfact(int n){
            if(n== 0 || n == 1){
                return 1;
            }
            int fact_nm1= getfact(n-1);
            int fact= n * fact_nm1;
            return fact;
        }

// Q3- print the fibonacci sequence till the nth term;
        public static void getfibonacci(int a, int b, int n){
            if(n== 0){
                return;
            }
            int c= a+ b;
            System.out.println(c);
            getfibonacci(b, c, n-1);
        }
// Q4- Print x^n (Stack height must be = n)
        public static int getPower(int x, int n){
            if(x== 0){
                return 0;
            }
            if(n== 0){
                return 1;
            }
            // int xPownm1= getPower(x, n-1);
            // int xPow= x * xPownm1;
            // return xPow;
            // Stack height must be log n;
            if(n %2 == 0){
                return getPower(x, n/2) * getPower(x, n/2);
            }
            else{
                return getPower(x, n/2)* getPower(x, n/2)* x;
            }
        }
            
    public static void main(String argss[]){
        getsum(1, 6,0);
        int factorial = getfact(5);
        System.out.println(factorial);
// for getting fibonacci sequence
        int a= 0, b= 1;
        System.out.println("The fibonacci sequence is: ");
        System.out.println(a);
        System.out.println(b);
        int n=5;
        getfibonacci(a, b, n-2);
// for getting the power of a number
        int power= getPower(2, 5);
        System.out.println("Calulating power: "+ power);
        
        
    }
    
}
