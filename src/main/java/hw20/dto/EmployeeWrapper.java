package hw20.dto;

import hw20.dto.EmployeeWrapper.Fields;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldNameConstants;


import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldNameConstants
@XmlRootElement(name = Fields.employees)
public class EmployeeWrapper {

    private List<Employee>employees;
}
