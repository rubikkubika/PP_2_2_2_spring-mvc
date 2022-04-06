package springmvcapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import springmvcapp.model.Car;
import springmvcapp.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String carView(@RequestParam(defaultValue = "5") Integer count, ModelMap model) {
        model.addAttribute("carListView", CarService.getListCar(count));
        return "cars";

    }

}
