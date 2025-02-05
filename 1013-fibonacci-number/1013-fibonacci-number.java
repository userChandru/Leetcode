class Solution {
    public int fib(int n) {
        if(n==0 || n==1)
            return n;
        // int[] fibo= new int[n+1];
        // fibo[0]=0;
        // fibo[1]=1;
        List<Integer> fibo= new ArrayList<>();
        fibo.add(0);
        fibo.add(1);
        for(int i=2; i<=n; i++)
            fibo.add(fibo.get(i-1) + fibo.get(i-2));
            // fibo[i] = fibo[i-1]+ fibo[i-2];
        return fibo.get(n);

    }
}