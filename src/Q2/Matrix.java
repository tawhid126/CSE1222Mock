package Q2;

import java.util.ArrayList;

public class Matrix {
    private final String[][] grid;
    private final int numRows;
    private final int numColumns;

    public static class Cell {
        private final int row;
        private final int column;

        public Cell(int row, int column) {
            this.row = row;
            this.column = column;
        }

        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        @Override
        public String toString() {
            return "Cell{" + "row=" + row + ", column=" + column + '}';
        }
    }

    public Matrix(int numRows, int numColumns) {
        if (numRows <= 0 || numColumns <= 0) {
            throw new IllegalArgumentException("Number of rows and columns must be positive");
        }
        this.numRows = numRows;
        this.numColumns = numColumns;
        this.grid = new String[numRows][numColumns];
    }

    public void set(int row, int column, String description) {
        validateIndices(row, column);
        grid[row][column] = description; // Set the description
    }

    public String get(int row, int column) {
        validateIndices(row, column);
        return grid[row][column];
    }

    public void clear(int row, int column) {
        validateIndices(row, column);
        grid[row][column] = null; // Clear the description
    }

    public ArrayList<Cell> getDescribedCells() {
        ArrayList<Cell> describedCells = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (grid[i][j] != null) {
                    describedCells.add(new Cell(i, j));
                }
            }
        }

        return describedCells;
    }

    public void printMatrix() {
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                System.out.print((grid[i][j] != null ? grid[i][j] : "null") + "\t");
            }
            System.out.println();
        }
    }

    private void validateIndices(int row, int column) {
        if (row < 0 || row >= numRows || column < 0 || column >= numColumns) {
            throw new IndexOutOfBoundsException("Invalid row or column index");
        }
    }


}