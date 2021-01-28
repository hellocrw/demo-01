package com.ly.springboot.demo01.mapper;

import com.ly.springboot.demo01.entity.LyTestXsxx;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


@Mapper
public interface LyTestXsxxMapper extends tk.mybatis.mapper.common.Mapper<LyTestXsxx> {

    @Delete("delete from LY_TEST_XSXX where xh = #{xh}")
    Integer deleteByXh(String xh);

    @Update("update LY_TEST_XSXX set  XM=#{xm}, XB=#{xb}, NL=#{nl}, ZY=#{zy}, BYSJ=#{bysj}, BYXX=#{byxx} where XH = #{xh}")
    Integer updateStu(LyTestXsxx lyTestXsxx);

    @Select("select * from LY_TEST_XSXX where xm like #{key}")
    List<LyTestXsxx> search(String key);
}
