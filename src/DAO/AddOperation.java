package DAO;

public class AddOperation extends Operation {

    @Override
    public double getResult() {
        return this.getNumber1()+this.getNumber2();
    }
}
