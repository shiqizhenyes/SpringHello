package com.example.zack;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.tags.Param;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.sql.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

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

    @RequestMapping(value = "/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String jsion) {
        System.out.println("JSESSIONID"+jsion);
        return SUCCESS;
    }

    /**
     * pojo 级联属性 springMvc 为pojo对象自动填值
     * @param user
     * @return
     */
    @RequestMapping(value = "/testPojo")
    public String testPojo(User user) {
        System.out.println("name:"+user.getUserName()+"city:"+user.getAddress().getCity());
        return SUCCESS;
    }


    @RequestMapping(value = "/testServletApi")
    public void testServletApi(HttpServletRequest request, HttpServletResponse response, Writer writer) throws IOException {
        System.out.println("request"+request+"response"+response);
        writer.write("hello spring mvc");
//        return SUCCESS;
    }

    @RequestMapping(value = "/testModelAndView")
    public ModelAndView testModelAndView() {
        String viewName = SUCCESS;
        ModelAndView modelAndView = new ModelAndView(viewName);
        modelAndView.addObject("time",new Date());
        System.out.println("modelAndView" + modelAndView);
        return modelAndView;
    }

    @RequestMapping(value = "/testMap")
    public String toString(Map<String,Object> map) {
        map.put("names", Arrays.asList("tom","jerry","zack"));
        System.out.println(map.getClass().getName());
        return SUCCESS;
    }
}