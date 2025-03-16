package org.example;

import Interfaces.IMatrix;

import java.util.Arrays;
import java.util.Objects;

public class Matrix implements IMatrix {
    private final int dimension;
    private double[] matrix;
    private boolean flag;
    public double determinate;

    public Matrix(int dimension){
        this.dimension = dimension;
        matrix = new double[dimension * dimension];
        flag = false;
    }

    public Matrix(int dimension, double[] matrix){
        this.dimension = dimension;
        this.matrix = matrix;
        flag = false;
    }

    public double getDimension(){
        return dimension;
    }

    public double[] getAr(){
        return matrix;
    }

    public boolean getFlag(){
        return flag;
    }

    @Override
    public double getElemByInd(int indStr, int indSto) {
        return matrix[indStr * dimension + indSto];
    }

    @Override
    public void setElemByInd(int indStr, int indSto, double value) {
        matrix[indStr * dimension + indSto] = value;
        flag = false;
    }
    public void stringSwap(int indStr1, int indStr2){
        double buf;
        for(int i = 0; i < dimension; i++){
            buf = getElemByInd(indStr1, i);
            setElemByInd(indStr1, i, getElemByInd(indStr2, i));
            setElemByInd(indStr2, i, buf);
        }
        flag = false;
    }
    public void stringSum(int indStr1, int indStr2){
        double facteur = -(getElemByInd(indStr2, indStr1)/ getElemByInd(indStr1, indStr1));
        for(int i = indStr1; i < dimension; i++){
            setElemByInd(indStr2, i, getElemByInd(indStr2,i) + facteur * getElemByInd(indStr1,i));
        }
        flag = false;
        //работает
    }

    @Override
    public double getDet() {
        if(flag){
            return determinate;
        }
        else {
            double det = 1;
            for (int k = 0; k < dimension - 1; k++) {
                for (int i = k + 1; i < dimension; i++) {
                    if (getElemByInd(k, i) != 0) {
                        stringSum(k, i);
                    }
                }
                if (getElemByInd(k, k) == 0) {

                    for (int i = k; i < dimension; i++) {
                        if (getElemByInd(i, k) != 0) {
                            stringSwap(i, k);
                        }
                    }
                }
            }
            System.out.println("Not hehe \n");
            for (int i = 0; i < 9; i++) {
                System.out.println(matrix[i]);
            }
            for (int i = 0; i < dimension; i++) {
                det *= getElemByInd(i, i);
            }
            flag = true;
            determinate = det;
            return det;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return dimension == matrix1.dimension && Objects.deepEquals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dimension, Arrays.hashCode(matrix));
    }
}
