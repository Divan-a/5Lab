package Interfaces;

public interface IMatrix {
    double getElemByInd(int indStr, int indSto);
    void setElemByInd(int indStr, int indSto, double value);
    double getDet();
}
