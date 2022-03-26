package lesson31;

import lesson25.entity.Department;
import lesson25.entity.Employee;
import lesson31.dto.EmployeeDto;
import lesson31.projection.EmployeeProjection;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.math.BigDecimal;
import java.util.List;



public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
