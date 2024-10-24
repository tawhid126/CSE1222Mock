package Q2;

import java.util.ArrayList;

public class Runner2 {
    public static void main(String[] args) {

        Matrix matrix = new Matrix(3, 3);

        matrix.set(0, 0, "A1");
        matrix.set(1, 1, "B2");
        matrix.set(2, 2, "C3");

        System.out.println("Description at (1,1): " + matrix.get(1, 1));

        ArrayList<Matrix.Cell> describedCells = matrix.getDescribedCells();

        System.out.println("Described Cells:");
        for (Matrix.Cell cell : describedCells) {
            System.out.println(cell);
        }

        System.out.println("Matrix:");
        matrix.printMatrix();
    }
}
