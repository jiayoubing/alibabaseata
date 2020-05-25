package com.infosys.china.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.infosys.china.entity.Storage;

/**
 * 库存操作
 * 
 * @author Jiayoubing
 * @version [版本号,2020年4月19日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
@Mapper
public interface StorageMapper
{

    Storage selectById(@Param("id") Integer id);

    Storage findByProductId(@Param("productId") String productId);

    int updateById(Storage record);

    void insert(Storage record);

    void insertBatch(List<Storage> records);

    int updateBatch(@Param("list") List<Long> ids, @Param("productId") String productId);
}
