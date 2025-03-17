package org.example;

import Interfaces.IMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MatrixServiceTest {
    UpTriangleMatrix upTriangleMatrix = new UpTriangleMatrix(3); // 10
    public void take(){
        upTriangleMatrix.setElemByInd(0, 0, 2);
        upTriangleMatrix.setElemByInd(0, 1, 4);
        upTriangleMatrix.setElemByInd(0, 2, 9);
        upTriangleMatrix.setElemByInd(1, 1, 1);
        upTriangleMatrix.setElemByInd(1, 2, 8);
        upTriangleMatrix.setElemByInd(2, 2, 5);
    }

    DiagMatrix diagMatrix = new DiagMatrix( new double[] {3, 5, 6});//90

    Matrix matrix = new Matrix(3, new double[]{5, 3, 4, 7, 1, 3, 4, 5, 2});//53

    @Test
    public void arrangeMatrices(){
        take();
        IMatrix[] arr = new IMatrix[]{matrix, diagMatrix, upTriangleMatrix};
        MatrixServise.arrangeMatrices(arr);
        assertEquals(new IMatrix[]{upTriangleMatrix, matrix, diagMatrix}, arr);
    }
}
