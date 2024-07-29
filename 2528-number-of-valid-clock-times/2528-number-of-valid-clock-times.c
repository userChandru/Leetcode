int countTime(char* time) {
    int ans=1;
    if(time[4]=='?') ans=10;
    if(time[3]=='?') ans*=6;
    if(time[1]=='?' && time[0]=='?') ans*=24;
    else if(time[1]=='?' && (time[0]=='0'|| time[0]=='1')) ans*=10; 
    else if(time[1]=='?' && (time[0]=='2')) ans*=4;
    else if(time[0]=='?' && (time[1]>='0' && time[1]<='3')) ans*=3;
    else if(time[0]=='?' && (time[1]>='4' && time[1]<='9')) ans*= 2;
    return ans;
}