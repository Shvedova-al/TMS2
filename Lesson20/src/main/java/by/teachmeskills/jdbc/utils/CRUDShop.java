package by.teachmeskills.jdbc.utils;

import by.teachmeskills.jdbc.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUDShop {

        private static final String GET_ALL_PRODUCT_QUERY = "SELECT * FROM products";
        private static final String INSERT_PRODUCT_QUERY = "INSERT INTO products(title, description, price, amount, inStock) VALUES(?, ?, ?, ?, ?);";
        private static final String UPDATE_PRODUCT_QUERY = "UPDATE products SET amount = ? WHERE id = ?;";
        private static final String DELETE_PRODUCT_QUERY = "DELETE FROM products WHERE id = ?";

        public CRUDShop() {
        }

        public static List<Product> getAllProducts() {
            ArrayList products = new ArrayList();

            try {
                Connection connection = DbShop.getConnection();

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM products");
                    ResultSet rs = preparedStatement.executeQuery();

                    while(rs.next()) {
                        int id = rs.getInt("id");
                        String title = rs.getString("title");
                        String description = rs.getString("description");
                        int price = rs.getInt("price");
                        int amount = rs.getInt("amount");
                        String inStock = rs.getString("inStock");
                        products.add(new Product(id, title, description, price, amount, inStock));
                    }
                } catch (Throwable var9) {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (Throwable var8) {
                            var9.addSuppressed(var8);
                        }
                    }

                    throw var9;
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException var10) {
                System.out.println(var10.getMessage());
            }

            return products;
        }

        public static List<Product> saveProduct(Product product) {
            Object updatedProducts = new ArrayList();

            try {
                Connection connection = DbShop.getConnection();

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO products(title, description, price, amount, inStock) VALUES(?, ?, ?, ?, ?)");
                    preparedStatement.setString(1, product.getTitle());
                    preparedStatement.setString(2, product.getDescription());
                    preparedStatement.setInt(3, product.getPrice());
                    preparedStatement.setInt(4, product.getAmount());
                    preparedStatement.setString(5, product.getInStock());
                    preparedStatement.executeUpdate();
                    updatedProducts = getAllProducts();
                } catch (Throwable var6) {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (Throwable var5) {
                            var6.addSuppressed(var5);
                        }
                    }

                    throw var6;
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException var7) {
                System.out.println(var7.getMessage());
            }

            return (List)updatedProducts;
        }

        public static List<Product> updateProduct(int productId, int amount) {
            Object updatedProducts = new ArrayList();

            try {
                Connection connection = DbShop.getConnection();

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement("UPDATE product SET amount = ? WHERE id = ?;");
                    preparedStatement.setInt(1, amount);
                    preparedStatement.setInt(2, productId);
                    preparedStatement.executeUpdate();
                    updatedProducts = getAllProducts();
                } catch (Throwable var7) {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (Throwable var6) {
                            var7.addSuppressed(var6);
                        }
                    }

                    throw var7;
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException var8) {
                System.out.println(var8.getMessage());
            }

            return (List)updatedProducts;
        }

        public static List<Product> deleteProduct(int productId) {
            Object updatedProducts = new ArrayList();

            try {
                Connection connection = DbShop.getConnection();

                try {
                    PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM products WHERE id = ?");
                    preparedStatement.setInt(1, productId);
                    preparedStatement.execute();
                    updatedProducts = getAllProducts();
                } catch (Throwable var6) {
                    if (connection != null) {
                        try {
                            connection.close();
                        } catch (Throwable var5) {
                            var6.addSuppressed(var5);
                        }
                    }

                    throw var6;
                }

                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException var7) {
                System.out.println(var7.getMessage());
            }

            return (List)updatedProducts;
        }
    }


