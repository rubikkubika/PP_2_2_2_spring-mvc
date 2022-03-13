package web.Service;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    public static List<Car> carService(List<Car> allCarsList, int count) {
        List<Car> viewCarList = new ArrayList<>();
        switch (count) {
            case 1 -> {
                viewCarList.clear();
                viewCarList.addAll(allCarsList.subList(0, 1));
            }
            case 2 -> {
                viewCarList.clear();
                viewCarList.addAll(allCarsList.subList(0, 2));
            }
            case 3 -> {
                viewCarList.clear();
                viewCarList.addAll(allCarsList.subList(0, 3));
            }
            case 4 -> {
                viewCarList.clear();
                viewCarList.addAll(allCarsList.subList(0, 4));
            }
            default -> {
                viewCarList.addAll(allCarsList.subList(0, 5));
            }
        }
        return viewCarList;
    }
}
