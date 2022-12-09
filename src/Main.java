import model.Order;
import model.Product;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> storeusers = new ArrayList<>();
        User user1 = new User("Jose Mourihno",98696969,17);
        User user2 = new User("Elon Musk",5210109,29);
        storeusers.add(user1);


        Product product1 = new Product("Sweat shirt","9000","Zara","good");
        Product product2 = new Product("Tank top","3000","Gucci","ramro cha");
        Product product3 = new Product("T shirt","4000","Prada","galtilo cha");
        Product product4 = new Product("Ganji","3080","Nike","very good");
        Product product5 = new Product("Baniyan","2000","Balenciaga","white");

        ArrayList<Order> orders = new ArrayList<>();
        Order order1 = new Order("Shirt","34","Mamaghar");
        Order order2 = new Order("T shirt","68","Sasurali");
        orders.add(order1);

        System.out.println();


        product1.result();






    }

}
