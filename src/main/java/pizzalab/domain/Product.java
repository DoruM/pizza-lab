package pizzalab.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="product_type",
        discriminatorType = DiscriminatorType.INTEGER)
@Getter
public abstract class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO, generator = "product_key_sequence_generator")
  @SequenceGenerator(name = "product_key_sequence_generator", sequenceName = "product_sequence", allocationSize = 1)
  private Long id;

  protected int quantity = 0;
  protected long price = -1;
  protected String description;
}
