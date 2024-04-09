package org.mfon.section11_Abstraction_in_Java.AbstractClassChallenge;
/*
In this challenge, you need to build an application, that can be a storefront, for any imaginable item for sale.
Instead of the Main class we usually create, create a Store class, with a main method. The Store class should:
- manage a list of products for sale, including displaying the product details.
- manage an order, which can just be a list of OrderItem objects
- have methods to add an item to the order, and print the ordered items, so it looks like a sales receipt.

Create A ProductForSale class that should have at least three fields:  a type, price, and a description, and should have
methods to:
- get a Sales Price,
- a concrete method, which takes a quantity, and returns the quantity * the price.
- print a Priced Line Item,

-- a concrete method, which takes a quantity, and should print an itemized line item for an order, with quantity and
line item price. show Details, an abstract method, which represents what might be displayed on a product page,
product type, description, price, and so on.

-- Create an OrderItem type, that has at a minimum 2 fields, quantity and a Product for Sale.
You should create two or three classes that extend the ProductForSale class, that will be products in your store.
 */

import java.util.ArrayList;
record OrderItem(int qty, ProductForSale product){}

public class Store {
    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        storeProducts.add(new ArtObject("Oil Painting", 1350, "Impressionistic work by ABF painted in 2010"));
        storeProducts.add(new ArtObject("Sculpture", 2000, "Bronze work by JKF, produced in 1950"));

        storeProducts.add(new Furniture("Desk", 500, "Mahogany Desk"));
        storeProducts.add(new Furniture("Lamp", 200, "Tiffany Lamp with Hummingbirds"));


        listProducts();
        System.out.println("\nOrder 1");
        var order1 = new ArrayList<OrderItem>();
        addItemToOrder(order1, 1, 2);
        addItemToOrder(order1, 0, 1);
        printOrder(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addItemToOrder(order2, 3, 5);
        addItemToOrder(order2, 0, 1);
        addItemToOrder(order2, 2, 1);
        //addItemToOrder(order1, 0, 1);
        printOrder(order2);
    }
    public static void listProducts(){
        for (var item : storeProducts){
            System.out.println("-".repeat(30));
            item.showdetails();
        }
    }
    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty){
      order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){
        double salesTotal = 0;
        for (var item : order){
            item.product().printPricedItem(item.qty());
            salesTotal += item.product().getSalesPrice(item.qty());
        }
        System.out.printf("Sales = $%6.2f %n", salesTotal);
    }


}
