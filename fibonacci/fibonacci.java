// Better Fibonacci

public static int betterFibonacci(int n) {
    
    int a = 0;
    int b = 1;
    
    int c = 0;
    
    if (n == 0){
        return a;
    }
    if(n == 1){
        return b;
    }
    
    for(int i = 2; i <= n; i++){
        c = a + b;
        a = b;
        b = c;
    }
    return c;
}