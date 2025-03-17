package Comparator;

import Interfaces.IMatrix;

import java.util.Comparator;

public class MatrixComparator implements Comparator<IMatrix> {

    public int compare(IMatrix mat1, IMatrix mat2){
        return Double.compare(mat1.getDet(), mat2.getDet());
    }

}
