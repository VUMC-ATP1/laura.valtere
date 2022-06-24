package Classroom.Invoice;

import lombok.ToString;

@ToString
public class Invoice {
    public int id;
    public Customer customer;
    public double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public double getAmountAfterDiscount() {
        return amount - (amount / 100 * customer.discount);
    }
}
