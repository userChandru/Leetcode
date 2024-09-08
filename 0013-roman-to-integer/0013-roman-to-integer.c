#include <string.h>

int romanToInt(char* s) {
    int num = 0;
    int roman[26];
    roman['I'-'A'] = 1;
    roman['V'-'A'] = 5;
    roman['X'-'A'] = 10;
    roman['L'-'A'] = 50;
    roman['C'-'A'] = 100;
    roman['D'-'A'] = 500;
    roman['M'-'A'] = 1000;

    for (int i = 0; s[i + 1] != '\0'; i++)
        if (roman[s[i]-'A'] < roman[s[i + 1]-'A'])
            num -= roman[s[i]-'A'];
        else
            num += roman[s[i]-'A'];
    num += roman[s[strlen(s)-1]-'A'];
    return num;
}