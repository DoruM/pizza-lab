package pizzalab.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Builder
@ToString
@Getter
@Entity
public final class MenuItem implements Comparable {

  @Id
  private Long id;

  private String description;
  private Long price;

  @ManyToMany
  @Column(name="menus")
  private List<Menu> menus;

  @Override
  public int compareTo(Object o) {
    return description.compareTo(((MenuItem) o).description);
  }
}
