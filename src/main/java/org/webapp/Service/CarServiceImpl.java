package org.webapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.webapp.model.CarModel;

import java.util.Set;

@Service
public class CarServiceImpl implements CarService {
    private Set<CarModel> carList;

    @Autowired
    public CarServiceImpl(@Qualifier("carList") Set<CarModel> carList) {
        this.carList = carList;
    }

    @Override
    public Set<CarModel> getAll() {
        return carList;
    }

    @Override
    public CarModel getCarById(int carId) {
        for (CarModel car : carList) {
            if (car.getId() == carId) {
                return car;
            }
        }
        return null;
    }

    @Override
    public boolean addCar(CarModel carModel) {
        for (CarModel car : carList) {
            if (carModel.getId() == car.getId()) {
                return false;
            }
        }
        return carList.add(carModel);
    }

    @Override
    public CarModel editCar(CarModel carModel) {
        for (CarModel car : carList) {

            if (car.getId() == carModel.getId()) {
                carList.remove(car); //remove old item
                carList.add(carModel); //add new one instead
                return carModel;
            }
        }
        return null;
    }

    @Override
    public boolean removeCarById(int carId) {
        for (CarModel car : carList) {
            if (car.getId() == carId) {
                return carList.remove(car);
            }
        }
        return false;
    }
}
