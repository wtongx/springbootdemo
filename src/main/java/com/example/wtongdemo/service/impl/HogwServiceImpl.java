package com.example.wtongdemo.service.impl;

import com.example.wtongdemo.service.HogwService;
import org.springframework.stereotype.Service;

/**
 * @Author wtong
 * @Date 2021/07/01
 */

@Service
public class HogwServiceImpl implements HogwService {

    @Override
    public String test2(String name){
        return "我是test2fangfa 服务层返回"+name;
    }
}
