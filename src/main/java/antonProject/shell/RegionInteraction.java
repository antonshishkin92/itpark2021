package antonProject.shell;

import antonProject.model.Region;
import antonProject.service.RegionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@Slf4j
@ShellComponent
@RequiredArgsConstructor
public class RegionInteraction {
    private final RegionService regionService;

    @ShellMethod(value = "Create region", key = "cr")
    public void createRegion(
            @ShellOption({"-c", "--code"}) Integer regionCode,
            @ShellOption({"-n", "--nReg"}) String nameRegion) {
        final Region region = new Region(regionCode, nameRegion);
        regionService.save(region);
        log.debug("Добавлен регион {}", region);
    }

    @ShellMethod(value = "delete region", key = "dr")
    public void deleteRegion(
            @ShellOption({"-c", "--code"}) Integer regionCode) {
        regionService.deleteByCode(regionCode);
        log.debug("Регион удален {}", regionCode);
    }

    @ShellMethod(value = "Find region", key = "fr")
    public void findRegion(
            @ShellOption({"-c", "--code"}) Integer regionCode) {
        regionService.findByCode(regionCode).ifPresentOrElse(region -> log.info("Найден регион {}", region), () -> log.warn("Регион {} не найден", regionCode)
        );
    }
}
