package org.webapp.Service;

import org.webapp.model.CarModel;

import java.util.Set;

public interface CarService {
    Set<CarModel> getAll();

    CarModel getCarById(int carId);

    boolean addCar(CarModel carModel);

    CarModel editCar(CarModel carModel);

    boolean removeCarById(int carId);
}
