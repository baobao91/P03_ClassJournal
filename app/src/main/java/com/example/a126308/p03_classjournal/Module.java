package com.example.a126308.p03_classjournal;

/**
 * Created by 15056215 on 7/5/2017.
 */

public class Module {
    private String code;
    private String name;


    public Module (String code, String name){
        this.code = code;
        this.name = name;

    }
    public String getName(){
        return code;
    }
    public String getDate(){
        return name;
    }


}


