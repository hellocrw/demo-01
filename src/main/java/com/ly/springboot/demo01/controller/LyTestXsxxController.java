package com.ly.springboot.demo01.controller;

import com.ly.springboot.demo01.entity.LyTestXsxx;
import com.ly.springboot.demo01.service.LyTestXsxxServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")  // 跨域问题
public class LyTestXsxxController {
    @Resource
    private LyTestXsxxServiceImpl lyTestXsxxService;


    @GetMapping("/query")
    public List<LyTestXsxx> query(){
        return lyTestXsxxService.qurey();
    }

    @GetMapping("/delete/{xh}")
    public String deleteStu(@PathVariable("xh") String xh){
        System.out.println(xh);
        int res = lyTestXsxxService.delete(xh);
        System.out.println(res);
        return res>0? "删除成功": "删除失败";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String create(LyTestXsxx lyTestXsxx){
        System.out.println(lyTestXsxx.toString());
        int res = lyTestXsxxService.create(lyTestXsxx);
        return res ==1 ?  "增加成功": "增加失败";
    }

    @PostMapping("/update")
    public String update(LyTestXsxx lyTestXsxx){
        int res = lyTestXsxxService.update(lyTestXsxx);
        return res > 0 ? "修改成功" : "修改失败";
    }

    @GetMapping("/search/{key}")
    public List<LyTestXsxx> search(@PathVariable("key") String key){
        List<LyTestXsxx> lyTestXsxxes = lyTestXsxxService.search(key);
        return lyTestXsxxes;
    }

}
