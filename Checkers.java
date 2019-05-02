
/**
 * play checkers
 * @wilson mayfield
 * @5-1-19 created
 * @5-2-19 finished
 */

public class Checkers{
    public static void printBoard(){
        String[][] cb = new String[8][8]; // checker board array
        for(int i = 0; i < cb.length; i++){ // makes sure it's less than cb.length, which is 8
            for(int j = 0; j < cb[0].length; j++){ // also makes sure it's less than cb.length, which is 8
                cb[i][j] = (i + j) % 2 == 0 ? "B" : "W"; // checks if the position is even or odd, and prints B or W accordingly.
                //uses modulo of 2 on the sum of i & j to check if it is even or odd
            }
        }
        System.out.println("+---+---+---+---+---+---+---+---+"); //starting line
        for(int i=0; i<8; i++) //prints board, moves to the next line every increment, ripped from sudoku
        {
            System.out.println("| "+cb[i][0]+" | "+cb[i][1]+" | "+cb[i][2]+" | "+cb[i][3]+" | "+cb[i][4]+" | "+cb[i][5]+" | "
                +cb[i][6]+" | "+cb[i][7]+" | ");
            System.out.println("+---+---+---+---+---+---+---+---+");
        }
    }
}
