package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import Service.CarService;
import model.Car;

import java.util.List;

@Controller
public class CarsController {
    @GetMapping(value = "/cars")
    public String carView(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("carListView", CarService.carService(count));
        return "cars";

    }

}
