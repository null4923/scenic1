package com.bawei.scenic.controller;

import com.bawei.scenic.vo.ResultEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
public class UploadController {

    @RequestMapping("/upload")
    public ResultEntity upload(MultipartFile file){
        if(file != null && !file.isEmpty()){
            String originalFilename = file.getOriginalFilename();
            String fileName = UUID.randomUUID()+""+originalFilename;
            File f = new File("E:\\pic",fileName);
            try {
                file.transferTo(f);
                String userface = "http://localhost:93/img/"+fileName;
                return ResultEntity.ok(userface);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return ResultEntity.error();
    }
}
