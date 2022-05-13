package antonProject.repository;

import antonProject.model.Car;
import antonProject.repository.dto.CarParamDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface CarRepository extends JpaRepository<Car, Integer> {
    @Query("select c from Car c" +
            " join fetch c.category categ" +
            " join fetch c.brand b" +
            " join fetch c.numberState n" +
            " join fetch c.nameOwner nam" +
            " join fetch c.surnameOwner s" +
            " join fetch c.region r" +
            " where (:#{#paramDto.carId} is null or c.id = :#{#paramDto.carId}) and " +
            "(:#{#paramDto.category} is null or c.category = :#{#paramDto.category}) and " +
            "(:#{#paramDto.brand} is null or lower(c.brand) like concat('%', :#{#paramDto.brand} , '%')) and" +
            "(:#{#paramDto.nameOwner} is null or c.nameOwner =:#{#paramDto.nameOwner}) and" +
            "(:#{#paramDto.surnameOwner} is null or lower(c.surnameOwner) like concat('%', :#{#paramDto.surnameOwner} , '%')) and" +
            "(:#{#paramDto.regionCode} is null or c.region =:#{#paramDto.regionCode}) and" +
            "(:#{#paramDto.numberState} is null or lower(c.numberState) like concat('%', :#{#paramDto.numberState}, '%'))")
    List<Car> getByParams(@NotNull CarParamDto paramDto);
}