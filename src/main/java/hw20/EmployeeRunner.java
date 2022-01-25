package hw20;

import hw20.dto.Department;
import hw20.dto.Employee;
import hw20.dto.EmployeeWrapper;
import hw20.dto.Position;
import jakarta.xml.bind.JAXB;

import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;


public class EmployeeRunner {

    private static final List<Department> DEPARTMENTS = List.of(new Department("IT", "Samara"));

    private static final List<Position> POSITIONS = List.of(new Position("Developer", new BigDecimal(1000)),
            new Position("Tester", new BigDecimal(900)),
            new Position("Senior Developer", new BigDecimal(1400)),
            new Position("Team Leader", new BigDecimal(2200)),
            new Position("IT Director", new BigDecimal(3000))
    );

    private static int COUNTER = 1;

    public static void main(String[] args) {

        EmployeeWrapper employees =
                new EmployeeWrapper(List.of(
                        getEmployee("Шишкин Антон Алексеевич"),
                        getEmployee("Боширов Вадим Петрович"),
                        getEmployee("Максимова Вероника Сергеевна"),
                        getEmployee("Андронова Мария Валентиновна")
                ));
        Path path=Paths.get("C\\test\\employee.xml");
        Path parentPath =path.getParent();
        if (!parentPath.toFile().exists()){
            parentPath.toFile().mkdirs();
        }
        JAXB.marshal(employees, path.toFile());
    }

    private static Employee getEmployee(String fullName) {
        return new Employee().setLogin("user" + COUNTER++)
                .setFullname(fullName)
                .setTabnumber(new Random().nextInt(100_000) + "")
                .setDepartment(DEPARTMENTS.get(new Random().nextInt(DEPARTMENTS.size())))
                .setPosition(POSITIONS.get(new Random().nextInt(POSITIONS.size())));
    }
}
