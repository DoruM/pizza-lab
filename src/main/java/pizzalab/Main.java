package pizzalab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pizzalab.domain.Address;
import pizzalab.domain.Customer;
import pizzalab.domain.Menu;

import static java.util.Arrays.asList;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = "pizzalab")
public class Main {

  private static final DeliveryService deliveryService = new DeliveryService();
  public static final PantryService pantryService = new PantryService();


  public static void main(String[] args) {
    SpringApplication.run(Main.class, args);

    System.out.println("Welcome to Pizza Delivery Service");

    Customer john = Customer.builder()
        .name("John")
        .phone("012345678")
        .addresses(asList(Address.builder().street("John's street").build()))
        .build();
    deliveryService.addCustomer(john);

    Menu menu = pantryService.listMenu();

    System.out.println(menu);

  }
}

@RestController
class FirstController {
  @GetMapping("/")
  public String getSomething() {
    return "Hello world!";
  }
}

