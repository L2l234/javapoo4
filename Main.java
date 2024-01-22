package Supplier.ex02;

import java.util.function.Supplier;


public class Main {
    
    public static void main(String[] args){
        Supplier<Product> MakeProduct = new MakeProduct();
        Product prod = MakeProduct.get();
        
        System.out.println("Products: ");
        System.out.println(prod);
    }
}
