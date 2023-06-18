package com.study.springclimb.music;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
  热更新步骤：
   1.Ctrl+Shift+A 搜索：registry 找到Registry... 注意是带三个点那个
   2.找到compiler.automake.allow.when.app.running 勾选
   3.执行快捷键  Ctrl+F9  才执行热加载
   
 */
@SpringBootApplication
@MapperScan("com.study.springclimb.music.dao")
public class MusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

}
