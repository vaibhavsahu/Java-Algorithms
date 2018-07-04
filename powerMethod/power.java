//Write a method - pow(x,n) that returns the value of x raised to the power of n (xn). n can be negative! 

public static double pow(double x, int n) {
    if(n==0){
        return 1;
    }
    if( n > 0){
        return x*pow(x, n-1);
    }
    if(n < 0){
        return 1/x*pow(x, n+1);
    }
return 0.0;
}