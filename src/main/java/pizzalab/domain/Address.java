package pizzalab.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "address_key_sequence_generator")
    @SequenceGenerator(name = "address_key_sequence_generator", sequenceName = "address_sequence", allocationSize = 1)
    private Long id;

    @ManyToMany
    private List<Customer> customer;

    String street;
}
