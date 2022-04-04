package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CarService {
    public  List<Car> getCars(int count) {
        List<Car> allCarsList = new ArrayList<>();
        allCarsList.add(new Car(1, "toyota", "model1"));
        allCarsList.add(new Car(2, "toyota", "model2"));
        allCarsList.add(new Car(3, "toyota", "model3"));
        allCarsList.add(new Car(4, "toyota", "model4"));
        allCarsList.add(new Car(5, "toyota", "model5"));
        return allCarsList.stream().limit(count).toList();
    }
}
