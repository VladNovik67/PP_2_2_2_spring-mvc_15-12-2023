package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsService;

import java.util.Optional;

@Controller
public class CarsController {

    private CarsService carsService;

    public CarsController(CarsService carsService) {
        this.carsService = carsService;
    }

    @GetMapping("/cars")
    public String createTableCars(@RequestParam(value = "count", required = false) Optional<Integer> count,
                                  Model model) {
        model.addAttribute("cars", carsService.getCars(count.orElse(0)));
        return "/cars";
    }
}
