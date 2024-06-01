package com.wanlok.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping(value = "test", produces = MediaType.APPLICATION_JSON_VALUE, method = {RequestMethod.GET})
    public MyRequest get(@RequestParam("a") String a, @RequestParam("b") String b) {
        MyRequest myRequest = new MyRequest();
        myRequest.setA(a);
        myRequest.setB(b);
        return myRequest;
    }

    @RequestMapping(value = "test", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE, method = {RequestMethod.POST})
    public MyRequest post(@RequestBody MyRequest myRequest) {
        return myRequest;
    }
}
