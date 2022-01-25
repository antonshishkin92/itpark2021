package hw20;

import hw20.dto.Department;
import hw20.dto.Employee;
import hw20.dto.EmployeeWrapper;
import hw20.dto.Position;
import jakarta.xml.bind.JAXB;
import lombok.SneakyThrows;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;
import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
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
        System.out.println("Запуск программы");
        EmployeeWrapper employees =
                new EmployeeWrapper(List.of(
                        getEmployee("Шишкин Антон Алексеевич"),
                        getEmployee("Боширов Вадим Петрович"),
                        getEmployee("Максимова Вероника Сергеевна"),
                        getEmployee("Андронова Мария Валентиновна")
                ));
        Path path = Paths.get("D:\\test\\employee.xml");
        Path parentPath = path.getParent();
        System.out.printf("Попытка создания родительской директории %s\n", parentPath);
        if (!parentPath.toFile().exists()) {
            parentPath.toFile().mkdirs();
        }
        System.out.printf("маршалинг данных в файл %s\n", path.getFileName());
        JAXB.marshal(employees, path.toFile());
        Document document = getDocument(path.toFile());
        System.out.printf("Осуществляем поиск сотрудников с заработной платой, выше средней %d\n", getAverageSalary(document));
    }

    private static Employee getEmployee(String fullName) {
        return new Employee().setLogin("user" + COUNTER++)
                .setFullname(fullName)
                .setTabnumber(new Random().nextInt(100_000) + "")
                .setDepartment(DEPARTMENTS.get(new Random().nextInt(DEPARTMENTS.size())))
                .setPosition(POSITIONS.get(new Random().nextInt(POSITIONS.size())));
    }

    @SneakyThrows
    private static List<Employee> searchEmployeesWithMoreAverageSalary(Document doc) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        NodeList nodeList = (NodeList) xPathFactory.newXPath().compile("//employee/position/salary").evaluate(doc, XPathConstants.NODESET);
        return Collections.emptyList();
    }

    @SneakyThrows
    private static Integer getAverageSalary(Document doc) {
        XPathFactory xPathFactory = XPathFactory.newInstance();
        Double result = (Double) xPathFactory.newXPath().compile("sum(//salary) div count(//salary) ").evaluate(doc, XPathConstants.NUMBER);
return result !=null ? result.intValue() : 0;
    }

    @SneakyThrows
    private static Document getDocument(File file) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = factory.newDocumentBuilder();
        return documentBuilder.parse(file);
    }
}


