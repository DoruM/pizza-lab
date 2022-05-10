package pizzalab.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {

  @Id
  private Long id;

  private String name;
  private String phone;
  private String hashedPassword;
  private String creditCard;

  @ManyToMany
  private List<Address> addresses;

}
