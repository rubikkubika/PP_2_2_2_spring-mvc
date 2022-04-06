package springmvcapp.service;

import org.springframework.stereotype.Service;
import springmvcapp.model.Car;

import java.util.ArrayList;
import java.util.List;


import springmvcapp.model.Car;

@Service
public class CarService {
    private static List<Car> allCarsList = new ArrayList<>();

    public CarService() {
        allCarsList.add(new Car(1, "toyota", "model1"));
        allCarsList.add(new Car(2, "toyota", "model2"));
        allCarsList.add(new Car(3, "toyota", "model3"));
        allCarsList.add(new Car(4, "toyota", "model4"));
        allCarsList.add(new Car(5, "toyota", "model5"));
    }

    public static List<Car> getListCar(Integer count) {
        return allCarsList.stream().limit(count).toList();
    }
}
