public class TicTacToe
{
    public TicTacToe ()
    {
        marks = new Mark [N][N];
    }

    boolean gameOver ()
    {
        boolean gameStatus;
        for (Mark [] element : marks){ //checking the rows
            gameStatus = true;
            for (Mark mark: element)
            {
                if (!mark.equals(element[0])){
                    gameStatus = false;
                    break;
                }
            }
            if (gameStatus)
                return true;
        }


        for (int columnIndex = 0; columnIndex<N; columnIndex ++) // checking the columns
        {
            gameStatus=true;
            for (int rowIndex = 0; rowIndex<N; rowIndex ++)
            {
                if (!marks [rowIndex][columnIndex].equals(marks[0][columnIndex])) {
                    gameStatus = false;
                    break;
                }
            }
            if (gameStatus)
                return true;
        }

        gameStatus = true;
        for (int rowIndex = 0; rowIndex<N; rowIndex++) //checking the left to right diagonal
        {
            for (int columnIndex = 0; columnIndex<N; columnIndex++)
            {
                if (columnIndex==rowIndex & !(marks[rowIndex][columnIndex]==marks[0][0]))
                {
                    gameStatus=false;
                    break;
                }
            }
        }
        if (gameStatus)
            return true;

        gameStatus = true;
        for (int rowIndex = 0; rowIndex<N; rowIndex++) //checking the right to left diagonal
        {
            for (int columnIndex = 0; columnIndex<N; columnIndex++)
            {
                if (columnIndex+rowIndex==N-1 & !(marks[rowIndex][columnIndex]==marks[N-1][0]))
                {
                    gameStatus=false;
                    break;
                }
            }
        }

        return gameStatus;
    }

    private final int N = 3;
    public Mark[][] marks;

}
