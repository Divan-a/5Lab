package org.example;

import Comparator.MatrixComparator;
import Interfaces.IMatrix;

import java.util.Arrays;

public class MatrixServise {
    public static void arrangeMatrices(IMatrix[] array){
        Arrays.sort(array, new MatrixComparator());
    }
}
