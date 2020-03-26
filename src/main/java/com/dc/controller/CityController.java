package com.dc.controller;

import com.dc.entity.City;
import com.dc.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class CityController {

    @Autowired
    private CityService cityService;


    @GetMapping("/getCityList")
    public List<City> getCityList() {
        return cityService.getCityList();
    }

    @GetMapping("/getCityByCityId")
    public City getCityById(String cityId) {
        return cityService.getByCityId(cityId);
    }

    @GetMapping("/insert")
    public String insert() {
        cityService.insert();
        return "success";
    }

    @GetMapping("/update")
    public String update(String cityId) {
        cityService.update(cityId);
        return "success";
    }

    @GetMapping("/delete")
    public String delete(String cityId) {
        cityService.delete(cityId);
        return "success";
    }

    @GetMapping("/getCount")
    public Integer getCount() {
        return cityService.getCount();
    }

}
