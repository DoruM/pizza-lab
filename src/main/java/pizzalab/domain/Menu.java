package pizzalab.domain;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Builder
@Data
@Entity
public class Menu {
  @Id
  private Long id;

  @ManyToMany
  @Column(name = "items")
  private List<MenuItem> items;

  private Date createdAt;
  private Date validUntil;
  private Date lastUpdatedAt;


}

