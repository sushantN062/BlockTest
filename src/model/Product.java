package model;

public class Product {
    String Product_name;
    String Price;
    String Brand;
    String Description;

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public Product(String code) {
        Code = code;
    }

    String Code;

    public Product(String product_name, String price, String brand, String description) {
        Product_name = product_name;
        Price = price;
        Brand = brand;
        Description = description;

    }

    public String getProduct_name() {
        return Product_name;
    }

    public void setProduct_name(String product_name) {
        Product_name = product_name;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }




        public void result() {
            System.out.println("Name: " + Product_name);
            System.out.println("Price: " + Price);
            System.out.println("Brand: " + Brand);
            System.out.println("Description: " + Description);
            System.out.println("Code: "+ Code);
        }
    }


