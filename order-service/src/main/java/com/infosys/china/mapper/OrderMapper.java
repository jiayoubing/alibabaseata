package com.infosys.china.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.infosys.china.entity.Order;

@Mapper
public interface OrderMapper {

    int insert(@Param("order") Order record);

}