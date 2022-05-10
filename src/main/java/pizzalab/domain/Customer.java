package pizzalab.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "customer_key_sequence_generator")
  @SequenceGenerator(name = "customer_key_sequence_generator", sequenceName = "customer_sequence", allocationSize = 1)
  private Long id;

  private String name;
  private String phone;
  private String hashedPassword;
  private String creditCard;

  @ManyToMany(cascade=CascadeType.ALL)
  private List<Address> addresses;

}
