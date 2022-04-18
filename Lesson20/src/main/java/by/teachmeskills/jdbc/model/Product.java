package by.teachmeskills.jdbc.model;

public class Product {
    private int id;
    private String title;
    private String description;
    private int price;
    private int amount;
    private String inStock;

    public Product(int id, String title, String description, int price, int amount, String inStock) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.inStock = inStock;
    }



    public Product(String title, String description, int price, int amount, String inStock) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.amount = amount;
        this.inStock = inStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                ", inStock=" + inStock +
                '}';
    }
}
