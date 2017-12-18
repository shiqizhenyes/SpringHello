package com.example.zack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.tags.Param;

@RequestMapping("/hello")
@Controller
public class HelloWord {

    private String SUCCESS = "success";

    @RequestMapping("/helloSpring")
    public String helloSpring() {
        System.out.print(SUCCESS);
        return SUCCESS;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public String test() {
        return SUCCESS;
    }


    @RequestMapping(value = "/testParamsAndHeads", params = {"username", "age!=10"},
            headers = {"Accept-Language=zh-CN,zh;q=0.9"})
    public String testParamsAndHeads() {
//        System.out.print;
        return SUCCESS;
    }

    @RequestMapping("/testAntPath/*/abc")
    public String testAntPath() {
        return SUCCESS;
    }

    @RequestMapping(value = "/testVariable/{id}")
    public String testVariable(@PathVariable("id") Integer id) {
        System.out.print("testVariable" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.GET)
    public String testRestGet(@PathVariable("id") Integer id) {
        System.out.print("test get" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.POST)
    public String testRestPost(@PathVariable("id") Integer id) {
        System.out.print("test post" + id);
        return SUCCESS;
    }


    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.DELETE)
    public String testRestDelete(@PathVariable("id") Integer id) {
        System.out.print("test delete" + id);
        return SUCCESS;
    }

    @RequestMapping(value = "/testRest/{id}", method = RequestMethod.PUT)
    public String testRestPut(@PathVariable("id") Integer id) {
        System.out.print("test put" + id);
        return SUCCESS;
    }


    @RequestMapping(value = "/testParams")
    public String testParams(@RequestParam(value = "username", required = false) String un,
                             @RequestParam(value = "age", required = false, defaultValue = "0") Integer age) {

        System.out.println("username:"+un+"age:"+age);
        return SUCCESS;
    }
}