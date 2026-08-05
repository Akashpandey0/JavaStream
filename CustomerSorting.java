
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Customer {
    private int id;
    private String name;
    private double orderValue;

    // constructor
    public Customer(int id, String name, double orderValue) {
        this.id = id;
        this.name = name;
        this.orderValue = orderValue;
    }

    // getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getOrderValue() {
        return orderValue;
    }

    @Override
    public String toString() {
        return "Customer{id=" + id + ", name='" + name + "', orderValue=" + orderValue + "}";
    }
}

public class CustomerSorting {
    public static void main(String[] args) {
        List<Customer> customers = Arrays.asList(
            new Customer(43, "Akash", 1500.0),
            new Customer(12, "Priya", 2500.0),
            new Customer(56, "Rahul", 1800.0)
        );

        List<Customer> sortedCustomers = customers.stream()
            .sorted(Comparator.comparingInt(Customer::getId))
            .collect(Collectors.toList());
    

        sortedCustomers.forEach(customer -> 
            System.out.println(customer)
        );
    }
}