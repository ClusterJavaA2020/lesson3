package org.webapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.webapp.Service.CarService;
import org.webapp.model.CarModel;

import java.util.Set;

@RestController
@RequestMapping("/")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CarController {
    private CarService carService;

    @GetMapping("/cars")
    public Set<CarModel> getAll() {
        return carService.getAll();
    }

    @GetMapping("/car/{carId}")
    public CarModel getCarById(@PathVariable int carId) {
        return carService.getCarById(carId);
    }

    @PostMapping("/car/add")
    public boolean addCar(@RequestBody CarModel carModel) {
        return carService.addCar(carModel);
    }

    @PutMapping("/car/edit")
    public CarModel editCar(@RequestBody CarModel carModel) {
        return carService.editCar(carModel);
    }

    @DeleteMapping("/car/remove/{carId}")
    public boolean removeCarById(@PathVariable int carId) {
        return carService.removeCarById(carId);
    }
}
