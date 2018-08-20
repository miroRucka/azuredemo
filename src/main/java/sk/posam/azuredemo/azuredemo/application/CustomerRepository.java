package sk.posam.azuredemo.azuredemo.application;

import org.springframework.data.repository.CrudRepository;
import sk.posam.azuredemo.azuredemo.domain.Customer;

/**
 * @author rucka
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {

}