package com.example.wtongdemo.controller;

import com.example.wtongdemo.dto.UserDto;
import com.example.wtongdemo.service.HogwService;
import com.example.wtongdemo.service.impl.HogwServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author wtong
 * @Date 2021/07/01
 */

@RestController
public class Hogwars {
    //@Autowired在一个类中使用另一个类，注入
    @Autowired
    private HogwService hogwService;

    @GetMapping("index/test1/{id}")//@PathVariable动态uri
    public String test1(@PathVariable Integer id){
        return "我是大唐经里id="+id;
    }
    //@RequestMapping(默认method=RequestMethod.Get,value="index/test3")
    @RequestMapping("index/test3")
    public String test3(){
        System.out.println("我是日志信息logtest3");
        return "我是大唐经里111";
    }

    @GetMapping("index/test2")   //@RequestParam请求参数
    public String test2(@RequestParam(value = "name",required = false) String name){
        return hogwService.test2(name);
    }
    @PostMapping("index/test4")
    public String test4(@RequestBody UserDto userDto){    //@RequestBody将json/xml对象解析成JavaBean对象；
        return userDto.getName()+"的年纪test4"+userDto.getAge();
    }

}
