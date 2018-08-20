package sk.posam.azuredemo.azuredemo.domain.repository;

import sk.posam.azuredemo.azuredemo.domain.Customer;

import java.util.List;

/**
 * @author rucka
 */
public interface CustomerRepository{

    List<Customer> findByLastName(String lastName);

}
