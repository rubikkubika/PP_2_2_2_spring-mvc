package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Service.CarService;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String carView(@RequestParam(value = "count", required = false) int count, ModelMap model) {
        List<Car> allCarsList = new ArrayList<>();
        allCarsList.add(new Car(1, "toyota", "model1"));
        allCarsList.add(new Car(2, "toyota", "model2"));
        allCarsList.add(new Car(3, "toyota", "model3"));
        allCarsList.add(new Car(4, "toyota", "model4"));
        allCarsList.add(new Car(5, "toyota", "model5"));
        model.addAttribute("viewCarList",CarService.carService(allCarsList,count));
        return "cars";

    }

}
