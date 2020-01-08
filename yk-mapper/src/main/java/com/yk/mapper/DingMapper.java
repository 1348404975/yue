package com.yk.mapper;

import com.yk.pojo.Ding;
import com.yk.pojo.DingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DingMapper {
    int countByExample(DingExample example);

    int deleteByExample(DingExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(Ding record);

    int insertSelective(Ding record);

    List<Ding> selectByExample(DingExample example);

    Ding selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") Ding record, @Param("example") DingExample example);

    int updateByExample(@Param("record") Ding record, @Param("example") DingExample example);

    int updateByPrimaryKeySelective(Ding record);

    int updateByPrimaryKey(Ding record);
}