package com.dc.service;

import com.dc.entity.City;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CityService {
    List<City> getCityList();

    Integer getCount();


    City getByCityId(String cityId);

    void insert();

    void update(String cityId);

    void delete(String cityId);
}
