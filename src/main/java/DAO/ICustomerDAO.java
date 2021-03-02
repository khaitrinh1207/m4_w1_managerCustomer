package DAO;

import model.Customer;

import java.util.List;

public interface ICustomerDAO<T> {
    List<T> all();
    T findById(int id);
    boolean update(T t);
    boolean save(Customer customer, int id);

}
