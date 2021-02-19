package com.zzxaaas.epidemic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class Application {

    public static void main(String[] args) {

        // Spring应用启动
        SpringApplication.run(Application.class, args);

    }

}