package lesson40.mapper;
import lesson40.dto.GenreDto;
import lesson40.model.Genre;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Mapper
public interface GenreMapper {
    GenreDto toDto(Genre entity);
    Genre toEntity(GenreDto entity);

    default List<GenreDto> toDtos(List<Genre> entities) {
        return entities.stream().map(this::toDto).collect(Collectors.toList());
    }

    default Optional<GenreDto> toOptionalDto(Optional<Genre> entity) {
        return entity.map(this::toDto);
    }
}
