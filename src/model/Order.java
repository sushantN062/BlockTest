package model;

public class Order {
String Name;
String Order_id;

    public Order(String name, String order_id, String address) {
        Name = name;
        Order_id = order_id;
        Address = address;
    }

    String Address;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getOrder_id() {
        return Order_id;
    }

    public void setOrder_id(String order_id) {
        Order_id = order_id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
