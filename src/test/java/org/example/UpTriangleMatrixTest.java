package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UpTriangleMatrixTest {
    UpTriangleMatrix upTriangleMatrix = new UpTriangleMatrix(3);
    //2 4 9 1 8 5

    public void take(){
        upTriangleMatrix.setElemByInd(0, 0, 2);
        upTriangleMatrix.setElemByInd(0, 1, 4);
        upTriangleMatrix.setElemByInd(0, 2, 9);
        upTriangleMatrix.setElemByInd(1, 1, 1);
        upTriangleMatrix.setElemByInd(1, 2, 8);
        upTriangleMatrix.setElemByInd(2, 2, 5);
    }

    @Test
    public void setElemByIndTest1(){
        take();
        upTriangleMatrix.setElemByInd(1, 1, 3);
        assertEquals(3, upTriangleMatrix.getElemByInd(1,1));
    }

    @Test
    public void setElemByIndTest2(){
        take();
        assertThrows(IllegalArgumentException.class , ()-> upTriangleMatrix.setElemByInd(2, 1, 3));
    }


    @Test
    public void getElemByIndTest(){
        take();
        assertEquals(2, upTriangleMatrix.getElemByInd(0,0));
    }

    @Test
    public void getDimensionTest(){
        take();
        assertEquals(3, upTriangleMatrix.getDimension());
    }

    @Test
    public void getDetTest(){
        take();
        assertEquals(10, upTriangleMatrix.getDet());
    }
}