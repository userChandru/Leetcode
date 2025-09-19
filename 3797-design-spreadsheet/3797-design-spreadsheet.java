class Spreadsheet {
    HashMap<Character, int[]> sheet;
    public Spreadsheet(int rows) {
        sheet = new HashMap<>();
        for(char ch = 'A'; ch<='Z'; ch++)
            sheet.put(ch, new int[rows]);
    }
    
    public void setCell(String cell, int value) {
        char col = cell.charAt(0);
        int row = Integer.parseInt(cell.substring(1))-1;
        sheet.get(col)[row]=value;
    }
    
    public void resetCell(String cell) {
        char col = cell.charAt(0);
        int row = Integer.parseInt(cell.substring(1))-1;
        sheet.get(col)[row]=0;
    }
    
    public int getValue(String formula) {
        int sum=0;
        String cell1= (formula.split("\\+")[0]).substring(1);
        String cell2= (formula.split("\\+")[1]);
        if(cell1.charAt(0) > '9')
            sum+=sheet.get(cell1.charAt(0))[Integer.parseInt(cell1.substring(1))-1];
        else 
            sum+=Integer.parseInt(cell1);
        if(cell2.charAt(0) > '9')
            sum+=sheet.get(cell2.charAt(0))[Integer.parseInt(cell2.substring(1))-1];
        else 
            sum+=Integer.parseInt(cell2);
        return sum;
    }
}

/**
 * Your Spreadsheet object will be instantiated and called as such:
 * Spreadsheet obj = new Spreadsheet(rows);
 * obj.setCell(cell,value);
 * obj.resetCell(cell);
 * int param_3 = obj.getValue(formula);
 */