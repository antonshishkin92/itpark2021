package antonProject.shell;


import antonProject.model.Car;
import antonProject.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;


@Slf4j
@ShellComponent
@RequiredArgsConstructor
public class CarInteraction {
    private final CarService carService;

    @ShellMethod(value = "Create car", key = "cc")
    public void createCar(
            @ShellOption({"-i", "--id"}) Integer carId,
            @ShellOption({"-c", "--cat"}) String category,
            @ShellOption({"-b", "--brand"}) String brand,
            @ShellOption({"-ns", "--numSt"}) String numberState,
            @ShellOption({"-n", "--namOwn"}) String nameOwner,
            @ShellOption({"-s", "--surOwn"}) String surnameOwner,
            @ShellOption({"-r", "--regId"}) Integer regionId) {
        final Car car = new Car(carId, category, brand, numberState, nameOwner, surnameOwner, regionId);
        carService.save(car);
        log.debug("Машина добавлена в БД {}", car);
    }

    @ShellMethod(value = "Update car", key = "uc")
    public void updateCar(
            @ShellOption({"-i", "--id"}) Integer carId,
            @ShellOption({"-c", "--cat"}) String category,
            @ShellOption({"-b", "--brand"}) String brand,
            @ShellOption({"-ns", "--numSt"}) String numberState,
            @ShellOption({"-n", "--namOwn"}) String nameOwner,
            @ShellOption({"-s", "--surOwn"}) String surnameOwner,
            @ShellOption({"-r", "--regId"}) Integer regionId) {
        carService.findById(carId).ifPresent(car -> {
            car.setCategory(category);
            car.setBrand(brand);
            car.setNumberState(numberState);
            car.setNameOwner(nameOwner);
            car.setSurnameOwner(surnameOwner);
            car.setRegion(regionId);
            carService.save(car);
            log.debug("Успешно обновилась информация о машине {}", car);
        });
    }

    @ShellMethod(value = "Delete car", key = "dc")
    public void deleteCar(
            @ShellOption({"-i", "--id"}) Integer carId) {
        carService.deleteById(carId);
        log.debug("Машина удалена из БД {}", carId);
    }

    @ShellMethod(value = "Find car", key = "fc")
    public void findCar(
            @ShellOption({"-i", "--id"}) Integer carId) {
        carService.findById(carId).ifPresentOrElse(car -> log.info("Найдена машина {}", car), () -> log.warn("Машина {} в БД не обнаружена", carId)
        );
    }
}
