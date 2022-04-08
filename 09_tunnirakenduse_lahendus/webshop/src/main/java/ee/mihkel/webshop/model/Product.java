package ee.mihkel.webshop.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Product {
    @Id
    @GeneratedValue
    Long id;
    String name;
    double price;
    String imgSrc;
    String description;
    boolean active;

    // @OneToOne   @ManyToOne   @OneToMany   @ManyToMany
    // Category category;
}
