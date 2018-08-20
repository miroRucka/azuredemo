package sk.posam.azuredemo.azuredemo.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sk.posam.azuredemo.azuredemo.domain.Customer;

/**
 * @author rucka
 */
@RestController
public class RepoController {

    @Autowired
    private CustomerRepository repo;

    @GetMapping("/write")
    public void save(@RequestParam("firstname") String firstname, @RequestParam("lastname") String lastname) {
        Customer customer = new Customer(firstname, lastname);
        repo.save(customer);
    }


    @GetMapping("/read")
    public Iterable<Customer> get() {
        return repo.findAll();
    }
}
