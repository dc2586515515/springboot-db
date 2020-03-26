package com.dc.mapper;

import com.dc.entity.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CityMapper {

    //    @Select("SELECT * FROM DMHR.CITY ;")
    //达梦不支持mybatis的自动映射
    List<City> getCityList();

    Integer getCount();

    City getByCityId(@Param("cityId") String CityId);

    void insert(@Param("vo") City city);

    void update(@Param("vo") City city);

    void delete(@Param("cityId") String cityId);
}
