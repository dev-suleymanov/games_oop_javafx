package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 1 && isHorizontal(board, i) || isVertical(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean isHorizontal(int[][] board, int num) {
        boolean result = true;
        for (int i = 0; i < board[num].length; i++) {
            if (board[num][i] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isVertical(int[][] board, int num) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][num] != 1) {
                result = false;
                break;
            }
        }
        return result;
    }

}
