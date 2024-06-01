package com.wanlok.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping(value = "test", method = {RequestMethod.GET})
    public void get(@RequestParam("foo") String foo) {
        System.out.println("Hello World GET");
    }

//    @RequestMapping(value = "test", method = {RequestMethod.POST})
//    public void post(@RequestBody MyReq req) {
//        doStuff(req.getFoo());
//    }
}
