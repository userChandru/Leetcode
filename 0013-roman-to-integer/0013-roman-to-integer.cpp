class Solution {
public:
    int romanToInt(string s) {
        int num=0;
        vector<int> temp(128);
        temp['I']=1; 
        temp['V']=5; 
        temp['X']=10; 
        temp['L']=50; 
        temp['C']=100; 
        temp['D']=500; 
        temp['M']=1000; 
        
        for(int i=0; s[i+1]!='\0'; i++){
            if(temp[s[i]] < temp[s[i+1]])
                num-=temp[s[i]];
            else
                num+=temp[s[i]];
        }
        num+=temp[s.back()];
        return num;
    }
};