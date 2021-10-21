import java.util.*
public class Search {
    public class Catalog{
        private static int MIN_ITEMS = 3;

        private Products[] list;

        private int nextItem;

        public Catalog(){
            list = new Products[MIN_ITEMS];
            nextItem = 0;
        }
        public class Products {

            private String name;
            private int description;
            private double price;

            public Products(String name, int description, double price){
                this.name = name;
                this.description = description;
                this.price = price;
            }

            public String getName(){
                return this.name;
            }

            public int description(){
                return this.description;
            }

            public double getPrice(){
                return price;
            }
        }
