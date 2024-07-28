int numJewelsInStones(char* jewels, char* stones) {
    int total=0;
    for(int i=0; i < strlen(jewels); i++ )
        for(int j=0; j<strlen(stones); j++)
            if(stones[j]==jewels[i])
                total++;

    return total;
}