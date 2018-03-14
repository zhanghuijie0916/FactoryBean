package DAO;

public class SubOperation extends Operation {
    @Override
    public double getResult() {
        return this.getNumber1()-this.getNumber2();
    }
}
