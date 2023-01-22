public class Main
{
    public static void main (String[] args)
    {
        TicTacToe ttt = new TicTacToe ();
        ttt.marks = new Mark[][] {{Mark.Cross, Mark.Cross, Mark.Nought},
                                {Mark.Nought, Mark.Nought, Mark.Cross},
                                {Mark.Cross, Mark.Nought, Mark.Cross}};
        System.out.println (ttt.gameOver ());
    }
}