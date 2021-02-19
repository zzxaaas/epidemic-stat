package com.zzxaaas.epidemic.response;

import java.util.HashMap;
import java.util.Map;

public class Response {

    public static Map<String,Object> Success(){
        return new HashMap<String, Object>(){{
            put("status",1);
            put("message","success");
        }};
    }

    public static Map<String,Object> Error(String msg){
        return new HashMap<String, Object>(){{
            put("status",0);
            put("error",msg);
        }};
    }

    public static Map<String,Object> Data(Object obj){
        return new HashMap<String, Object>(){{
            put("status",1);
            put("message","success");
            put("data",obj);
        }};
    }
    public static Map<String,Object> ToLogin(){
        return new HashMap<String, Object>(){{
            put("status",-1);
            put("message","to login");
        }};
    }

}
