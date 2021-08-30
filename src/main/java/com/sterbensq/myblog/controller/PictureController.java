package com.sterbensq.myblog.controller;

import com.alibaba.fastjson.JSONObject;
import com.sterbensq.myblog.dao.ResponseMessage;
import com.sterbensq.myblog.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("picture")
public class PictureController {
    @Autowired
    PictureService service;

    @GetMapping("random")
    public JSONObject getRandomImage(){
        JSONObject object =new JSONObject();
        service.random(object);
        return object;
    }

    @PostMapping("save")
    public ResponseMessage save(@RequestParam("") String baoliu,@RequestParam("files") MultipartFile files[]){
        //`id`          int not null auto_increment comment '索引',
        //`stylelevel`  int not null default 0      comment '分类等级',
        //`stylename`   varchar(50) not null        comment '分类名称',
        //`fatherstyle` int  default 0              comment '父类Id',
        service.save(files);
        return new ResponseMessage(200,"保存成功",null);
    }

}
