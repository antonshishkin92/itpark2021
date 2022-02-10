package hw25;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "author_id")
    @GeneratedValue
    private String isbn;
    private String title;
    private String url;

    @OneToMany(mappedBy = "book")
    @Column(name = "title", nullable = false)
    private String author;
    private Integer pageCount;
    private BigDecimal price;


}
