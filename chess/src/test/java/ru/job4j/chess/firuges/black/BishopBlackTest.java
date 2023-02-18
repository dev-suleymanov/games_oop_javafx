package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

public class BishopBlackTest {

    @Test
    public void whenPositionE5Then4and3() {
        BishopBlack bb = new BishopBlack(Cell.E5);
        int[] exPosition = new int[]{4, 3};
        int[] cellPosition = new int[]{bb.position().getX(), bb.position().getY()};
        Assert.assertArrayEquals(exPosition, cellPosition);
    }

    @Test
    public void whenCopyFromA1ToE5Then4and3() {
        BishopBlack bishop = (BishopBlack) new BishopBlack(Cell.A1).copy(Cell.E5);
        int[] exPosition = new int[]{4, 3};
        int[] cellPosition = new int[]{bishop.position().getX(), bishop.position().getY()};
        Assert.assertArrayEquals(exPosition, cellPosition);
    }

    @Test
    public void whenIsDiagonalFromB2ToE5ThenTrue() {
        BishopBlack bishop = new BishopBlack(Cell.B2);
        Assert.assertTrue(bishop.isDiagonal(Cell.B2, Cell.E5));
    }

    @Test(expected = ImpossibleMoveException.class)
    public void whenWayIsNotDiagonalThenException() {
        new BishopBlack(Cell.B2).way(Cell.E4);
    }
}