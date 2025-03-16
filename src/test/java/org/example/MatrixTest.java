package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {
    Matrix matrix = new Matrix(3, new double[]{5, 3, 4, 7, 1, 3, 4, 5, 2});

    @Test
    public void getDimensionTest(){
        assertEquals(3, matrix.getDimension());
    }

    @Test
    public void getElemByIndTest(){
        assertEquals(3, matrix.getElemByInd(0, 1));
    }

    @Test
    public void getDetTest(){
        assertEquals(false, matrix.getFlag());
        assertEquals(53, Math.round(matrix.getDet()));
        assertEquals(true, matrix.getFlag());
    }

    @Test
    public void setElemByIndTest(){
        matrix.setElemByInd(0,1,4);
        assertEquals(false, matrix.getFlag());
        assertEquals(51, Math.round(matrix.getDet()));
        assertEquals(true, matrix.getFlag());
    }




}
