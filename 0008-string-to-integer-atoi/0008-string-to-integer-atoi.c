// #include <limits.h>

int myAtoi(char* s) {
    int i = 0, sign = 1;
    long num=0;
    while 
        (s[i] == ' ') i++;
    if (s[i] == '-') 
        sign = -1, i++;
    else if 
        (s[i] == '+') sign = 1, i++;
        
    while (s[i] >= '0' && s[i] <= '9') {
        if (num > INT_MAX / 10 || (num == INT_MAX / 10 && s[i] - '0' > INT_MAX % 10))
            return sign == 1 ? INT_MAX : INT_MIN;
        num = num * 10 + (s[i] - '0');
        i++;
    }
    return num * sign;
}