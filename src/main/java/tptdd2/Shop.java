package tptdd2;

import jdk.jshell.spi.ExecutionControl;

import java.util.List;

public class Shop {
    private List<Product> products;

    public Shop(List<Product> products) {
        this.products = products;
    }

    public void update(Product product) throws ExecutionControl.NotImplementedException{
        if (product.getQuality() == 0) {
            product.setQuality(product.getQuality() / 2);
        }
    }
}
