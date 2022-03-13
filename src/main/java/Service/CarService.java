package Service;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> carService(int count) {
        List<Car> allCarsList = new ArrayList<>();
        allCarsList.add(new Car(1, "toyota", "model1"));
        allCarsList.add(new Car(2, "toyota", "model2"));
        allCarsList.add(new Car(3, "toyota", "model3"));
        allCarsList.add(new Car(4, "toyota", "model4"));
        allCarsList.add(new Car(5, "toyota", "model5"));
        return allCarsList.stream().limit(count).toList();
    }
}
