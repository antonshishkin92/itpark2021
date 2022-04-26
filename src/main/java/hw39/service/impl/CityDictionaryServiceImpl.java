package hw39.service.impl;

import hw39.dto.CityDto;
import hw39.service.CityDictionaryService;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CityDictionaryServiceImpl implements CityDictionaryService {

    private static final Set<CityDto> CITIES = Set.of(new CityDto("SARATOV", "Саратов"),
            new CityDto("PENZA", "Пенза"),
            new CityDto("TAMBOV", "Тамбов"),
            new CityDto("MOSCOW", "Москва"),
            new CityDto("BELGOROD", "Белгород"));

    private static final Map<String, CityDto> CITY_MAP = CITIES.stream()
            .collect(Collectors.toMap(CityDto::getCityCode, Function.identity()));

    @Override
    public Set<CityDto> getCities() {
        return CITIES;
    }

    @Override
    public Optional<CityDto> getCityByCode(String code) {
        return Optional.ofNullable(CITY_MAP.get(code));
    }
}
