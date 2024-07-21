char* categorizeBox(int l, int w, int h, int mass) {
    int heavy=(mass>=100);
    int bulky=(l>=10000 || w>=10000 || h>=10000 || (long long)l*w*h>=1000000000);
    if(heavy && bulky) return "Both";
    if(!(heavy || bulky)) return "Neither";
    if(heavy && !bulky) return "Heavy";
    return "Bulky";
}