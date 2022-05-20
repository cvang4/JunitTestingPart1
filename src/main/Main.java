package main;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Dale");
        Customer customer2 = new Customer("Wanda");

        String typeOfCustomer1 = customer1.frequentCustomer();
        String typeOfCustomer2 = customer2.nonFrequentCustomer();

        customer1.howOld(21);
        customer2.howOld(56);

        System.out.println(customer1.name + " is a " + typeOfCustomer1 + " customer.");
        System.out.println(customer2.name + " is a " + typeOfCustomer2 + " customer.");

        customer1.printCustomer();
        customer2.printCustomer();
    }
}