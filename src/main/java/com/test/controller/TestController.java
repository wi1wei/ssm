package com.test.controller;

import com.github.pagehelper.PageHelper;
import com.test.entity.City;
import com.test.service.TestService;
import com.test.util.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class TestController {
    private static final Logger LOGGER = Logger.getLogger(TestController.class);
    @Resource
    private TestService service;

    @RequestMapping("/t")
    public String t() {
        PageHelper.startPage(1, 10, "city_id desc");
        List<City> list = service.getAll();
        LOGGER.debug("size:" + list.size());
        return "index";
    }

    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "hello";
    }
}
