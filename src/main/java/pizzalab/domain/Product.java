package pizzalab.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="product_type",
        discriminatorType = DiscriminatorType.INTEGER)
@Getter
public abstract class Product {
  @Id
  private Long id;

  protected int quantity = 0;
  protected long price = -1;

  public abstract String getDescription();
}
