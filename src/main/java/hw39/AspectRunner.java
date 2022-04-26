package hw39;

import hw39.dto.CityDto;
import hw39.service.CityDictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

@Slf4j
@SpringBootApplication
public class AspectRunner {

    private static final String TOMSK = "TOMSK";
    private static final String BARNAUL = "BARNAUL";

    public static void main(String[] args) {


        final ConfigurableApplicationContext applicationContext = SpringApplication.run(AspectRunner.class, args);
        final CityDictionaryService cityDictionaryService = applicationContext.getBean(CityDictionaryService.class);
        final Set<CityDto> cities = cityDictionaryService.getCities();
        log.info("Составлен список городов {}", cities);

        final CityDto barnaul = cityDictionaryService.getCityByCode(BARNAUL).orElse(null);
        log.info("ИНформация о городе с кодом {}: {}", BARNAUL, barnaul);

        final CityDto tomsk = cityDictionaryService.getCityByCode(TOMSK).orElse(null);
        log.info("ИНформация о городе с кодом {}: {}",TOMSK ,tomsk);
    }
}
