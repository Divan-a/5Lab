package org.example;

import Interfaces.IMatrix;

public class UpTriangleMatrix extends Matrix implements IMatrix {
    public UpTriangleMatrix(int dimension){
        super(dimension);
    }

    @Override
    public double getElemByInd(int indStr, int indSto){
        return super.getElemByInd(indStr, indSto);
    }

    @Override
    public void setElemByInd(int indStr, int indSto, double val){
        if(indSto < indStr){
            throw new IllegalArgumentException("Вы пытаетесь задать элемент лежащий ниже диагонали");
        }
        else{
            super.setElemByInd(indStr, indSto, val);
        }
    }


}
