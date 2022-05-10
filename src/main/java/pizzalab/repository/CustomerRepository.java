package pizzalab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pizzalab.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Customer findFirstByName(String name);
}
