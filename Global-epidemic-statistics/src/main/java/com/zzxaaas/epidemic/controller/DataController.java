package com.zzxaaas.epidemic.controller;

import com.zzxaaas.epidemic.response.Response;
import com.zzxaaas.epidemic.service.DataService;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/")
public class DataController {

    @Autowired
    private DataService dataService;

    @GetMapping("/getdata")
    public Map<String, Object> GetData(){

        JSONObject data = dataService.dataHandle();

        return Response.Data(data.toString());

    }

}
