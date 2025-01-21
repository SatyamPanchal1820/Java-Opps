 class Product {
    private int productId;
    private String name;
    private int price;
    private int quantityInStock;


    public Product(int productId, String name, int price, int quantityInStock) {
        this.productId = productId;
        this.name = name;
        setPrice(price);
        setQuantityInStock(quantityInStock);
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

   
    public void setPrice(int price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

 
    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock >= 0) {
            this.quantityInStock = quantityInStock;
        } else {
            System.out.println("Quantity in stock cannot be negative.");
        }
    }
    public boolean purchase(int quantity) {
        if (quantity <= quantityInStock) {
            quantityInStock -= quantity;
            return true;
        } else {
            System.out.println("Not enough stock available.");
            return false;
        }
    }
}
