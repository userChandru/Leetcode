int isVowel(char a){
    if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u')
        return 1;
    return 0;
}
int vowelStrings(char** words, int wordsSize, int left, int right) {
    int count=0;
    for(int i=left; i<=right; i++)
        if(isVowel(words[i][0]) && isVowel(words[i][strlen(words[i])-1]))
            count++;
    return count;
}