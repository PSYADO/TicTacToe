package Test;

import org.junit.Test;
import static org.junit.Assert.*;
import Main.TicTacToe;

public class TicTacToeTest {

    @Test
    public void testCheckWinner() {

        // Test horizontal win
        TicTacToe.board = new String[]{"X", "X", "X", "-", "-", "-", "-", "-", "-"};
        assertEquals("X", TicTacToe.checkWinner());

        // Test vertical win
        TicTacToe.board = new String[]{"O", "-", "-", "O"};
    }

}