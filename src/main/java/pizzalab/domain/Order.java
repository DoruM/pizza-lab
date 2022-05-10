package pizzalab.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
//@Entity
public class Order {
    @Id
    private Long id;

    private Customer customer;
    private Address address;
    private Date createdAt;
    private Date expectedTime;
    private Date actualDeliveryTime;

    private Long total;

    private List<Product> items;
}
