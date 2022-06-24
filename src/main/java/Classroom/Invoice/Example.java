package Classroom.Invoice;

public class Example {
    public static void main(String[] args) {
        Customer customer = new Customer(111, "Laura", 10);
        customer.getId();
        customer.getName();
        customer.getDiscount();

        Invoice invoice = new Invoice(22, customer, 50);
        System.out.println(invoice);
        System.out.println(invoice.getAmountAfterDiscount());
    }
}
