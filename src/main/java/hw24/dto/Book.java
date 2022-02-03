package hw24.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private Integer isbn;
    private String autor;
    private String bookName;
    private String genre;
    private int pages;
    private int price;

}
