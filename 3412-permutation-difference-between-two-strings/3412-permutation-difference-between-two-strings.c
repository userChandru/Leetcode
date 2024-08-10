int findPermutationDifference(char* s, char* t) {
    int seen[26]={0}, n = 0;
    while(n<strlen(s)){
        seen[(int)(s[n]-'a')] += n;
        seen[(int)(t[n]-'a')] -= n;
        n++;
    }
    int sum=0;
    for(int i=0; i<26; i++){
        sum+=abs(seen[i]);
    }
    return sum;
}