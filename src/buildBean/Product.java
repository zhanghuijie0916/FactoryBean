package buildBean;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private String productName;

    private List<String> parts = new ArrayList<>();

    public Product(){}

    public Product(String productName){
        this();
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<String> getParts() {
        return parts;
    }

    public void setParts(List<String> parts) {
        this.parts = parts;
    }

    @Override
    public String toString() {
        return "Prodect{" +
                "productName='" + productName + '\'' +
                ", parts=" + parts +
                '}';
    }

    public void showProduct(){
        System.out.println(this.toString());
    }

    /*
        想组合部分中添加部分
     */
    public void add(String part){
        parts.add(part);
    }

}
