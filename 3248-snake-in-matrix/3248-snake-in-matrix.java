class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x=0; 
        int y=0;
        for(String curr: commands){
            if(curr.equals("UP"))
                y--;
            if(curr.equals("DOWN"))
                y++;
            if(curr.equals("RIGHT"))
                x++;
            if(curr.equals("LEFT"))
                x--;
        }
        return y*n+x;
    }
}