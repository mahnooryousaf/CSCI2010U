public class TicTacToeTree {

    // YOUR CODE GOES HERE
    
    public static String makeMove(String oldBoard, int position, String player) {
        return oldBoard.substring(0, position) + player + oldBoard.substring(position + 1);
    }    
}
