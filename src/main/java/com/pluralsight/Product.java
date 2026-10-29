package com.pluralsight;

//product = describes what one product is -> What is one item?
public class Product {

    //1.add fields (Variables)
    private long productNumber;
    private String product;
    private double price;

    //2. create constructor - uses the same name as the class - no return type
    // initializes an object's fields when you create it
    public Product(long productNumber, String product , double price) {

        //Use the "this" keyword       Explanation:
        /*  this.name - the name stored in the employee object
               name   - the name passed into the constructor
                 =    - assigns the value on the right to the variable on the left */

        this.productNumber = productNumber;
        this.product = product;
        this.price = price;
    }

    //getter: reads and returns a private field
    //setter: changes the private value of product

    /*Since my fields are private, the other classes can't directly access them.
    Geter/setters provides controlled access.

     For this Inventory activity, I'm only going to make getters.
     I only need setters if the program needs to change a product after it's created.
     */


    //3. Create getters
    /* Understand getters
    public: other classes can use this method
    String: The method returns text
    getName: The method's name
    return name;: Sends back the employee's name
     */
    public long getProductNumber() {
        return productNumber;

    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }
}
