package hw25;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@ToString(exclude = "books")
@Table(name = "author")
@NoArgsConstructor
public class Author {

    @Id
    private Integer id;
    @Column(name = "name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private List<Author> authors;

    public Author(Integer authorId, String authorName) {
        this.id = authorId;
        this.name = authorName;
    }
}
