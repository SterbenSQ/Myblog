package com.sterbensq.myblog.controller;

import com.alibaba.fastjson.JSONObject;
import com.sterbensq.myblog.dao.ResponseMessage;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("register")
public class RegisterController {

    public ResponseMessage register(@RequestBody JSONObject object){
        ResponseMessage out=new ResponseMessage();

        return out;
    }
}
