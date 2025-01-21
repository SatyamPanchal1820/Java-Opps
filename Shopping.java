 class Product {
    private int productId;
    private String name;
    private int price;
    private int qunatityInStock;
    
    public Product(int productId, String name, int price, int quantityInStock) {
        this.productId = productId;
        this.name = name;
        this.price=price;
        this.qunatityInStock=quantityInStock;
    }
    public int getproductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantityInStock(){
        return qunatityInStock;
    }

    public void setPrice(){
        if(price>=0){
          System.out.println(price);
        }else{
            System.out.println("Price cannot be negative ");
        }
    }
    public void setQuantityInStock(){
        this.qunatityInStock=qunatityInStock;
    }
}
