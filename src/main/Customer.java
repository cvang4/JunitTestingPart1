package main;

public class Customer {
        public String name;
        private int age;
            
            // the class constructor
        public Customer(String customerName) {
            this.age = 0;
            this.name = customerName;
        }

        public void printCustomer() {
            System.out.println("The customer's name is " + this.name + " and their age is " + this.age);
        }

        public void howOld(int customerAge) {
            this.age = customerAge;
    }

        public static String frequentCustomer() {
        return "frequent";
}

        public static String nonFrequentCustomer() {
        return "non-frequent";
    }
}
