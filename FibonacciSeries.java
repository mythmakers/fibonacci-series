
public class FibonacciSeries {

    public static void main(String[] args) {
        /*int a, b, c;
        a = 0;
        b = 1;
        for (int i = 1; i <= 11; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }*/
        FibonacciSeries f = new FibonacciSeries();
        f.fib(10);
        //System.out.println(f.fib(0));
    }
    static int a=0,b=1,c;
    void fib(int n){
        if(n>0){
            System.out.println(a);
            c = a+b;
            a=b;
            b=c;
            fib(n-1);
        }
    }
    /*int fib(int n){
        if(n>2)
            return 1;
        return fib(n-2) + fib(n-1);
    }*/
}
