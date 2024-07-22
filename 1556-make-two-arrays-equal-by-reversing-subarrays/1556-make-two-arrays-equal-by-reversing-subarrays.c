bool canBeEqual(int* target, int targetSize, int* arr, int arrSize) {
    int seen[1001]={0};
    for(int i=0; i<targetSize; i++){
        seen[target[i]]++;
        seen[arr[i]]--;
    }
    for(int i=0; i<1001; i++)
        if(seen[i]!=0)
            return false;
    return true;
}