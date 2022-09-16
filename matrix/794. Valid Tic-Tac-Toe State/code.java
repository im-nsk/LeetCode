class Solution {
    public boolean validTicTacToe(String[] board) {
        int countX = 0, countO = 0;
        boolean xWin = false;
        boolean oWin = false;
        
        for(int i = 0; i < 3; i++){
            
            for(char c : board[i].toCharArray())
                {
                    if(c == 'X')countX++;
                    else if(c == 'O')countO++; 
                }
            //Check Horizontal
                if(board[i].equals("XXX")) xWin = true;
                else if(board[i].equals("OOO")) oWin = true;
                
            // Check Vertical 
               String ver = new StringBuilder()
                             .append(board[0].charAt(i))
                             .append(board[1].charAt(i))
                             .append(board[2].charAt(i))
                             .toString();
                if(ver.equals("XXX")) xWin = true;
                else if(ver.equals("OOO"))oWin = true;
                           
        }
          // check left diagonal    
        String diag1 = new StringBuilder()
                      .append(board[0].charAt(0)) 
                      .append(board[1].charAt(1))
                      .append(board[2].charAt(2))
                      .toString();
        if(diag1.equals("XXX"))xWin = true;
        else if(diag1.equals("OOO"))oWin = true;
        
         // check right diagonal    
        String diag2 = new StringBuilder()
                      .append(board[0].charAt(2)) 
                      .append(board[1].charAt(1))
                      .append(board[2].charAt(0))
                      .toString();
         if(diag2.equals("XXX"))xWin = true;
        else if(diag2.equals("OOO"))oWin = true;
        
        if(xWin)
            return !oWin && countX- countO == 1;
        else if(oWin)
            return countX == countO;
            
        return countX >= countO && countX - countO <=1;
        
        
    }
}