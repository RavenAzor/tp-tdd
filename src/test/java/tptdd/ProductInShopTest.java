package tptdd;

import org.junit.jupiter.api.Test;
import tptdd2.Product;
import tptdd2.Shop;

import java.util.List;

public class ProductInShopTest {

    Product product = new Product("drink", "Butterbeer", 0, 100);
    Shop shop = new Shop(List.of(product));
    @Test
    public void whenSellInIs0_thenQualityDegradeTwoTimesMore(){
        shop.update(product);
    }
}
