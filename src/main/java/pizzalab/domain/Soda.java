package pizzalab.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@DiscriminatorValue("2")
public class Soda extends Product {
  @Id
  private Long id;

  private String name;

  @Builder
  public Soda(int quantity, long price, String name) {
    this.quantity = quantity;
    this.price = price;
    this.name = name;
  }

  @Override
  public String getDescription() {
    return String.format("Soda %s", name);
  }
}
