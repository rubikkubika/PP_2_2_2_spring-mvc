package springmvcapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springmvcapp.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {
    List<Car> allCarsList = new ArrayList<>();

    public CarsController() {
        allCarsList.add(new Car(1, "toyota", "model1"));
        allCarsList.add(new Car(2, "toyota", "model2"));
        allCarsList.add(new Car(3, "toyota", "model3"));
        allCarsList.add(new Car(4, "toyota", "model4"));
        allCarsList.add(new Car(5, "toyota", "model5"));
    }

    @GetMapping(value = "/cars")
    public String carView(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("carListView", allCarsList.stream().limit(count).toList());
        return "cars";

    }

}
