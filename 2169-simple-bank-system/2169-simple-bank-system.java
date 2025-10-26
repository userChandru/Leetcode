class Bank {
    int n;
    long balances[];

    public Bank(long[] balance) {
        n = balance.length;
        balances = new long[n+1];
        for(int i=0; i<n; i++)
            balances[i+1] = balance[i];
    }
    public boolean valid(int acc, long amount){
        if(acc <= 0 || n < acc || balances[acc] < amount)
            return false;
        return true;
    }
    public boolean transfer(int account1, int account2, long money) {
        if(!valid(account1, money) || !valid(account2, 0))
            return false;
        return withdraw(account1, money) && deposit(account2, money);
    }
    
    public boolean deposit(int account, long money) {
        if(!valid(account, 0))
            return false;
        balances[account]+=money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!valid(account, money))
            return false;
        balances[account]-=money;
        return true;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */