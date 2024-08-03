// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

int firstBadVersion(int n) {
    int start = 0, end = n;
    while(start <= end){
        int mid = start + (end-start)/2;
        if(isBadVersion(mid) && !isBadVersion(mid-1)){
            return mid;
        }
        else if(!isBadVersion(mid))
            start = mid + 1;
        else 
            end = mid - 1;
    }
    return 0;
}