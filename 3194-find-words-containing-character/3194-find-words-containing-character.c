/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findWordsContaining(char** words, int wordsSize, char x, int* returnSize) {
    int *ans=(int*)malloc(sizeof(int)*wordsSize);
    int count=0;
    for(int i=0;i<wordsSize;i++){
        for(int j=0; j<strlen(words[i]);j++){
            if(words[i][j]==x){
                ans[count++]=i;
                break;
            }
        }
    }
    *returnSize=count;
    return ans;
}