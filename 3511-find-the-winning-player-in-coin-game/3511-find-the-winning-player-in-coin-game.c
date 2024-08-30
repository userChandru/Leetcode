char* losingPlayer(int x, int y) {
    return (((x<y/4)? x : y/4) % 2 != 0)?"Alice":"Bob";
}