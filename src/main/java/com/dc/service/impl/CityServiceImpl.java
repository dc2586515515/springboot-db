package com.dc.service.impl;

import com.dc.entity.City;
import com.dc.mapper.CityMapper;
import com.dc.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CityServiceImpl implements CityService {

    @Resource
    private CityMapper cityMapper;

    @Override
    public List<City> getCityList() {
        return cityMapper.getCityList();
    }

    @Override
    public Integer getCount() {
        return cityMapper.getCount();
    }

    @Override
    public City getByCityId(String cityId) {
        return cityMapper.getByCityId(cityId);
    }

    @Override
    public void insert() {
        City city = new City();
        city.setCityId(UUID.randomUUID().toString());
        city.setCityName("安徽" + UUID.randomUUID().toString());
        city.setRegionId(new Integer("340100"));
        cityMapper.insert(city);
    }

    @Override
    public void update(String cityId) {
        City city = new City();
        city.setCityId(cityId);
        city.setCityName("安徽修改" + UUID.randomUUID().toString());
        cityMapper.update(city);
    }

    @Override
    public void delete(String cityId) {
        cityMapper.delete(cityId);
    }
}
