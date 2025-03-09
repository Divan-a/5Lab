package org.example;

public class Main {
    public static void main(String[] args) {

        double flag = 1;

        Matrix matrix = new Matrix(3, new double[]{1, 4, 6, 2, 3, 4, 5, 1, 7});


        for(int i = 0; i < matrix.getDimension(); i++){
            for(int j = 0; j < matrix.getDimension(); j++){
                System.out.println(matrix.getElemByInd(i, j));
            }
        }

        System.out.println(matrix.getDet());

        System.out.println("HaHa");


    }
}