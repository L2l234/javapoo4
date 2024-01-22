package Supplier.ex02;

import java.util.function.Supplier;


public class MakeProduct implements Supplier<Product>{

    @Override
    public Product get() {
        return new Product("Apple", "Red", 5.0);
    }
    
}
