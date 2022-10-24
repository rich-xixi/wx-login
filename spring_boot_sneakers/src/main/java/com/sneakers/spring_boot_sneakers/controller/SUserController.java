package com.sneakers.spring_boot_sneakers.controller;

import com.alibaba.fastjson2.JSONObject;
import com.sneakers.spring_boot_sneakers.entity.SUser;
import com.sneakers.spring_boot_sneakers.service.SUserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.jar.JarEntry;

/**
 * 用户表，用于记录用户信息（微信用户）(SUser)表控制层
 *
 * @author makejava
 * @since 2022-10-24 11:31:47
 */
@RestController
@RequestMapping("/user")
public class SUserController {
    /**
     * 服务对象
     */
    @Resource
    private SUserService sUserService;

    @PostMapping("/demo")
    public void demo(@RequestBody JSONObject jsonObject){
        System.out.println(jsonObject);
    }


}

