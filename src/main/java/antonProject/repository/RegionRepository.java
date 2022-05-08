package antonProject.repository;

import antonProject.model.Region;
import antonProject.repository.dto.RegionParamDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.validation.constraints.NotNull;
import java.util.List;

public interface RegionRepository extends JpaRepository<Region,Long> {

    List<Region> getByParams(@NotNull RegionParamDto paramDto);
}
