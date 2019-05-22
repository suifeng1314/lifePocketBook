package com.cashbook.dao;

import com.cashbook.model.AppUser;
import com.cashbook.model.AppUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppUserMapper {
    int countByExample(AppUserExample example);

    int deleteByExample(AppUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppUser record);

    int insertSelective(AppUser record);

    List<AppUser> selectByExampleWithBLOBs(AppUserExample example);

    List<AppUser> selectByExample(AppUserExample example);

    AppUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppUser record, @Param("example") AppUserExample example);

    int updateByExampleWithBLOBs(@Param("record") AppUser record, @Param("example") AppUserExample example);

    int updateByExample(@Param("record") AppUser record, @Param("example") AppUserExample example);

    int updateByPrimaryKeySelective(AppUser record);

    int updateByPrimaryKeyWithBLOBs(AppUser record);

    int updateByPrimaryKey(AppUser record);
}