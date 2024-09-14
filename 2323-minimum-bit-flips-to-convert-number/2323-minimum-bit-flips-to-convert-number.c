int minBitFlips(int start, int goal) {
    int ans = start ^ goal, count=0;
    while(ans){
        if((ans)&1)  
            count++;
        ans>>=1;
    }
    return count;
}