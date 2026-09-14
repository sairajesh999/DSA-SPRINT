class Solution {
    public int fib(int n){
        int f=0;
        int s=1;
        
        for(int i=0;i<n;i++){
            int sum=f+s;
            f=s;
            s=sum;
        }
        return f;
    }
}