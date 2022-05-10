package antonProject.repository;

import antonProject.model.Region;
import antonProject.repository.dto.RegionParamDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface RegionRepository extends JpaRepository<Region, Integer> {
    @Query("select r from Region r" +
            " join fetch r.code code" +
            " join fetch r.nameRegion name" +
            " where (:#{#paramDto.codeRegion} is null or r.code = :#{#paramDto.codeRegion}) and" +
            "(:#{#paramDto.nameRegion} is null or r.nameRegion =:#{#paramDto.nameRegion})")
    List<Region> getByParams(@NotNull RegionParamDto paramDto);
}
