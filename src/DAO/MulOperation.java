package DAO;

public class MulOperation extends Operation {
    @Override
    public double getResult() {
        return this.getNumber1()*this.getNumber2();
    }
}
