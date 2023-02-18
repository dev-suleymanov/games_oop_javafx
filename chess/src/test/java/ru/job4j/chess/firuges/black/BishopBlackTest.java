package ru.job4j.chess.firuges.black;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BishopBlackTest {

    @Test
    public void whenPositionE5Then4and3() {
        BishopBlack bb = new BishopBlack(Cell.E5);
        int[] exPosition = new int[]{4, 3};
        int[] cellPosition = new int[]{bb.position().getX(), bb.position().getY()};
        assertThat(exPosition).containsExactly(cellPosition);
    }

    @Test
    public void whenCopyFromA1ToE5Then4and3() {
        BishopBlack bishop = (BishopBlack) new BishopBlack(Cell.A1).copy(Cell.E5);
        int[] exPosition = new int[]{4, 3};
        int[] cellPosition = new int[]{bishop.position().getX(), bishop.position().getY()};
        assertThat(exPosition).containsExactly(cellPosition);
    }

    @Test
    public void whenIsDiagonalFromB2ToE5ThenTrue() {
        BishopBlack bishop = new BishopBlack(Cell.B2);
        Assert.assertTrue(bishop.isDiagonal(Cell.B2, Cell.E5));
        assertThat(bishop.isDiagonal(Cell.B2, Cell.E5)).isTrue();
    }

    @Test
    public void whenNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.D8);
        Boolean result = bishopBlack.isDiagonal(bishopBlack.position(), Cell.E8);
        assertFalse(result);
    }
}