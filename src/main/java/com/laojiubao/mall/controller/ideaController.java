package com.laojiubao.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ideaController {
   @GetMapping("/info")
   @ResponseBody
  public String getInfoFromIdea() {
       return "this is a spring boot project from idea";
   }

    @GetMapping("/simple")
    public String simple(ModelMap map) {
        map.put("thymeleafText", "juejin");
        map.put("number1", 2019);
        map.put("number2", 3);
        return "simple";
    }

    @GetMapping("/test")
    public String test(ModelMap map) {
        map.put("title", "Thymeleaf 语法测试");
        map.put("testString", "Spring Boot 商城");
        map.put("bool", true);
        map.put("testArray", new Integer[]{2018, 2019, 2020, 2021});
        map.put("testList", Arrays.asList("Spring", "Spring Boot", "Thymeleaf", "MyBatis", "Java"));
        Map testMap = new HashMap();
        testMap.put("platform", "juejin");
        testMap.put("title", "Spring Boot 大型商城项目实战");
        testMap.put("author", "十三");
        map.put("testMap", testMap);
        map.put("testDate", new Date());
        return "test";
    }
}

