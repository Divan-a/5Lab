package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DiagMatrixTest {
    DiagMatrix diagMatrix = new DiagMatrix( new double[] {3, 5, 6});

    @Test
    public void setElemByIndTest1(){
        diagMatrix.setElemByInd(1, 1, 3);
        assertEquals(3, diagMatrix.getElemByInd(1,1));
    }

    @Test
    public void setElemByIndTest2(){
        assertThrows(IllegalArgumentException.class , ()-> diagMatrix.setElemByInd(1, 2, 3));
    }



    @Test
    public void getElemByIndTest(){
        assertEquals(3, diagMatrix.getElemByInd(0,0));
    }

    @Test
    public void getDimensionTest(){
        assertEquals(3, diagMatrix.getDimension());
    }

    @Test
    public void getDetTest(){
        assertEquals(90, diagMatrix.getDet());
    }
}
