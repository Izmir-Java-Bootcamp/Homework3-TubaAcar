import java.util.*
public class Checkout {
    //name, quantity, description, unit price, unit discounted price
    public class Products {

        private String name;
        private int quantity;
        private double description;
        private price;
        private discountedprice;

        public Products(String name, int quantity, double description, price, discountedprice){
            this.name = name;
            this.quantity = quantity;
            this.description = description;
            this.price = price;
            this.discountedprice = discountedprice;
        }
        public String getName(){
            return this.name;
        }
        public int getQuantity(){
            return this.quantity;
        }
        public int getdescription(){
            return this.description;
        }
        public double getPrice(){
            return price;
        }
        public int discountedprice(){
            return this.discountedprice;
        }
        public void setQuantity(int quantity){
            this.quantity=quantity;
        }
        public double getTotalPrice(){
            return quantity * price;
        }
        public String toString(){
            toStr="";
            toStr= toStr + getName();
            return toStr;
        }
    }
