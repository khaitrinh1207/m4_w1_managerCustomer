package DAO;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAO implements ICustomerDAO {
    private static List<Customer> customers = new ArrayList<>();

    static {
        customers.add(new Customer(1, "Khai", "khaitrinh1207@gmail.com", "Nghe An"));
        customers.add(new Customer(2, "Khai1", "khaitrinh1208@gmail.com", "Nghe An"));
        customers.add(new Customer(3, "Khai2", "khaitrinh1209@gmail.com", "Nghe An"));
        customers.add(new Customer(4, "Khai3", "khaitrinh1210@gmail.com", "Nghe An"));
        customers.add(new Customer(5, "Khai4", "khaitrinh1211@gmail.com", "Nghe An"));
    }

    public List<Customer> all() {
        return customers;
    }

    public Customer findById(int id) {
        Customer customer = customers.get(id);
        return customer;
    }

    @Override
    public boolean update(Object o) {
        return false;
    }

    @Override
    public boolean save(Customer customer, int id) {
        customers.set(id,customer);
        return false;
    }
}
