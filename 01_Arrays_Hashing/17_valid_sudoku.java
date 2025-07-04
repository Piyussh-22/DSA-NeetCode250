class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set = new HashSet<>();
        //row
        for(int i = 0 ; i < 9 ; i++ ){
            for(int j = 0 ; j < 9 ; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                if(set.contains(board[i][j])){
                    return false;
                }
                set.add(board[i][j]);
            }
            set.clear();
        }
        //column
        for(int i = 0 ; i < 9 ; i++ ){
            for(int j = 0 ; j < 9 ; j++){
                if(board[j][i] == '.'){
                    continue;
                }
                if(set.contains(board[j][i])){
                    return false;
                }
                set.add(board[j][i]);
            }
            set.clear();
        }
        //each3*3
        for (int k = 0 ; k < 9 ; k = k + 3){
            for (int q = 0 ; q < 9 ; q = q + 3){
                set.clear();
                for(int i = k ; i < k + 3 ; i++ ){
                    for(int j = q ; j < q + 3 ; j++){
                        if(board[i][j] == '.'){
                            continue;
                        }
                        if(set.contains(board[i][j])){
                            return false;
                        }
                        set.add(board[i][j]);
                    }
                }

            }
        }
        return true;
    }
}

/*
36. Valid Sudoku
Solved
        Medium
Topics
premium lock icon
        Companies
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.


        Example 1:


Input: board =
        [["5","3",".",".","7",".",".",".","."]
        ,["6",".",".","1","9","5",".",".","."]
        ,[".","9","8",".",".",".",".","6","."]
        ,["8",".",".",".","6",".",".",".","3"]
        ,["4",".",".","8",".","3",".",".","1"]
        ,["7",".",".",".","2",".",".",".","6"]
        ,[".","6",".",".",".",".","2","8","."]
        ,[".",".",".","4","1","9",".",".","5"]
        ,[".",".",".",".","8",".",".","7","9"]]
Output: true
Example 2:

Input: board =
        [["8","3",".",".","7",".",".",".","."]
        ,["6",".",".","1","9","5",".",".","."]
        ,[".","9","8",".",".",".",".","6","."]
        ,["8",".",".",".","6",".",".",".","3"]
        ,["4",".",".","8",".","3",".",".","1"]
        ,["7",".",".",".","2",".",".",".","6"]
        ,[".","6",".",".",".",".","2","8","."]
        ,[".",".",".","4","1","9",".",".","5"]
        ,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.


Constraints:

board.length == 9
board[i].length == 9
board[i][j] is a digit 1-9 or '.'.

 */