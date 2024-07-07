import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class validSudoku {

    public static void main(String[] args) {
        char[][] board =
                {
                        {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                };

        System.out.println( isvalid(board));
    }

    public static boolean isvalid(char[][] board){

        Set<Character>[] rowset =new HashSet[9];
        Set <Character>[] colset=new HashSet[9];
        Set<Character> [] gridset=new HashSet[9];

        for(int i=0;i<9;i++){
            rowset[i]=new HashSet<>();
            colset[i]=new HashSet<>();
            gridset[i]=new HashSet<>();
        }

        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                int gridno=(j/3) +(i/3)*3;

                if(board[i][j]!='.'){
                    boolean presentrow=rowset[i].contains(board[i][j]);
                    boolean presentcol=colset[j].contains(board[i][j]);
                    boolean prsentgrid=gridset[gridno].contains(board[i][j]);

                    if (presentcol || presentrow||prsentgrid){
                        return  false;
                    }

                    rowset[i].add(board[i][j]);
                    colset[j].add(board[i][j]);
                    gridset[gridno].add(board[i][j]);
                }
            }
        }
        return true;

    }
}
