class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int x=0; 
        int y=0;
        for(String curr: commands)
            if(curr.equals("UP"))
                y--;
            else if(curr.equals("DOWN"))
                y++;
            else if(curr.equals("RIGHT"))
                x++;
            else if(curr.equals("LEFT"))
                x--;
        return y*n+x;
    }
}