package lesson20.dto;


import com.opencsv.bean.CsvBindByName;
import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"id","bic","name"})
public class Bank {

    @XmlAttribute(name = "id")
    @CsvBindByName(column = "Идентификатор банка")
    private Long id;
    @CsvBindByName(column = "Наименование банка")
    private String name;
    @XmlAttribute(name = "bic")
    @CsvBindByName(column = "Бик")
    private String bic;
}
