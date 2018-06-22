package test.java.execiseTest;

import static org.junit.Assert.*;
import main.java.exercise3.*;

import org.junit.Test;

public class ChessBoardTest {

	@Test
	public void testChessBoard() {
		String a = "WW|";
		String b = "BB|";
		ChessBoard obj = new ChessBoard();
		String[][] c = obj.chessBoard(a, b);
		assertEquals("WW|",c[0][0]);
		assertEquals("BB|",c[0][1]);
		assertEquals("BB|",c[1][0]);
		assertEquals("WW|",c[1][1]);
	}

}
