package homework.oop_homework;

import lombok.ToString;

import java.util.Date;

@ToString
public class Visit extends Customer {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    public double totalExpense = serviceExpense + productExpense;

    public Visit(String name, Date date) {
        super(name);
        this.date = date;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() { return totalExpense; }
}
