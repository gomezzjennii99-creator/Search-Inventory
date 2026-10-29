package com.pluralsight;

import java.util.ArrayList;

// inventory - manages/creates my list of products -> What products do we have
public class Inventory {


    public ArrayList<Product> getInvetory() {

        // before adding five product, we need to create an empty list to hold them
        ArrayList<Product> inventory = new ArrayList<>();

        //add 5 products
        inventory.add(new Product(1234, " Hammer ",19.99 ));
        inventory.add(new Product(2345, " Screwdriver ", 9.99 ));
        inventory.add(new Product(3456, " Box of nails ",8.99 ));
        inventory.add(new Product( 4567, " Power Drill ",72.99 ));
        inventory.add(new Product(5678, " Measuring tape ", 14.99 ));

        //return the inventory
        return inventory;







    }
}