package hw20.dto;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Employee {

    private String tabnumber;
    private String login;
    private String fullname;
    private Department department;
    private Position position;
}
