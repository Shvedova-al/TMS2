package by.teachmeskills.jdbc;

import by.teachmeskills.jdbc.model.Product;
import by.teachmeskills.jdbc.utils.CRUDShop;

public class List {
            public List() {
        }
        public static void main(String[] args) {
            Product product = new Product("ручка", "синяя, для левши", 8, 24, "в наличии");
            System.out.println("Saved products:");
            System.out.println(CRUDShop.saveProduct(product));
            System.out.println("---------------------------------------------------");
            System.out.println("All products:");
            System.out.println(CRUDShop.getAllProducts());
            System.out.println("---------------------------------------------------");
            System.out.println("Updated products:");
            System.out.println(CRUDShop.updateProduct(2, 21));
            System.out.println("----------------------------------------------------");
            System.out.println("Deleted products: ");
            System.out.println(CRUDShop.deleteProduct(0));
        }
    }


