package com.sample.controller;

import com.sample.dao.IBlaDao;
import com.sample.entity.Bla;
import com.sample.model.request.BlaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by anurag on 6/6/17.
 */
@Controller
public class HelloController {

    @Autowired
    private IBlaDao blaDao;

    @RequestMapping(value = "/hello", method = {RequestMethod.POST})
    public @ResponseBody
    String sayHello(@RequestBody BlaRequest request) {
        Bla bla = new Bla();
        bla.setName(request.getName());
        blaDao.create(bla);
        return request.toString();
    }
}