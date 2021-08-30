package com.sterbensq.myblog.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

@Service
public class PictureService {

    public void save(MultipartFile[] files) {
        try{
            for(MultipartFile file:files){
                file.getOriginalFilename();//图片名称
                FileInputStream in= (FileInputStream) file.getInputStream();
                String savePath="";
                OutputStream out=new FileOutputStream(savePath);
                byte[] buffer=new byte[1024];
                int len=in.read(buffer);
                int off=0;
                while(len!=-1){
                    len=in.read(buffer);
                    out.write(buffer,off,len);
                    off+=len;
                }
                in.close();
                out.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JSONObject random(JSONObject object) {
        return object;
    }
}
