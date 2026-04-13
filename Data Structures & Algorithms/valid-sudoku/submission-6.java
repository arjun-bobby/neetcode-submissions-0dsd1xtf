class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set <Character> [] rows =new HashSet[9];
        Set <Character> [] cols=new HashSet[9];
        Set <Character> [] box= new HashSet[9];
        for (int k=0;k<9;k++){
            rows[k]= new HashSet<>();
            cols[k]=new HashSet<>();
            box[k]=new HashSet<>();
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val == '.') continue;  // skip empty

                int boxIndex = (i / 3) * 3 + (j / 3);
                if (!rows[i].add(val)) return false;       // duplicate in row
        if (!cols[j].add(val)) return false;       // duplicate in col
        if (!box[boxIndex].add(val)) return false; // duplicate in box

            }}

            return true;

}}
