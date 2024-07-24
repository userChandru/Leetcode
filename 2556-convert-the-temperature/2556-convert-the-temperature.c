/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
double* convertTemperature(double celsius, int* returnSize) {
    *returnSize=2;
    double* ans = (double*)malloc(sizeof(double)*2);
    ans[0]=celsius+273.15;
    ans[1]=celsius*1.80 +32;
    return ans;
}