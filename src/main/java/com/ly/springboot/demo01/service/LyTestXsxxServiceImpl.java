package com.ly.springboot.demo01.service;

import com.ly.springboot.demo01.entity.LyTestXsxx;
import com.ly.springboot.demo01.mapper.LyTestXsxxMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LyTestXsxxServiceImpl {
    @Resource
    private LyTestXsxxMapper lyTestXsxxMapper;

    public List<LyTestXsxx> qurey(){
        return lyTestXsxxMapper.selectAll();
    }

    public Integer create(LyTestXsxx lyTestXsxx){
        return lyTestXsxxMapper.insert(lyTestXsxx);
    }

    public Integer update(LyTestXsxx lyTestXsxx){
        System.out.println("xiugai");
        return lyTestXsxxMapper.updateStu(lyTestXsxx);
    }

    public Integer delete(String xh){
        return lyTestXsxxMapper.deleteByXh(xh);
    }

    public List<LyTestXsxx> search(String key){
        String name = "%" + key.trim() + "%";
        return lyTestXsxxMapper.search(name);
    }
}
