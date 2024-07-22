bool canBeEqual(int* target, int targetSize, int* arr, int arrSize) {
    for(int i=0; i<targetSize; i++){
        for(int j=i+1; j<targetSize; j++){
            if(target[i]>target[j]){
                int temp=target[i];
                target[i] = target[j];
                target[j]=temp;
            }
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
    }
    for(int i=0; i<targetSize; i++)
        if(target[i]!=arr[i])
            return false;
    return true;
}