package org.example;

import Interfaces.IMatrix;

public class DiagMatrix extends Matrix implements IMatrix {

    private double[] matrix;

    public DiagMatrix(double[] arr){
        super(arr.length);

        for(int i = 0; i < arr.length; i++){
            super.setElemByInd(i, i, arr[i]);
        }
    }

    public DiagMatrix(int dimension) {
        super(dimension);

    }


    @Override
    public void setElemByInd(int indStr, int indSto, double val){
        if(indSto != indStr){
            throw new IllegalArgumentException("Вы пытаетесь задать элемент не лежащий на диагонали");
        }
        else{
            super.setElemByInd(indStr, indSto, val);
        }
    }

    @Override
    public double getElemByInd(int indStr, int indSto){
        return super.getElemByInd(indStr, indSto);
    }

    @Override
    public double getDimension(){
        return super.getDimension();
    }

    @Override
    public double getDet(){
        return super.getDet();
    }
}
