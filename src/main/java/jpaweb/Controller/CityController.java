package Controller;


import Business.ICityService;
import entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

@RequestMapping("/city")
@RestController
@RequestScope
@CrossOrigin
public class CityController{
    @Autowired
    private ICityService cityService;

    @RequestMapping("/getall")
    public List<City> getAllCity(){
    so
    return cityService.GetAll();
    }
}
