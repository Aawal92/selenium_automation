package com.parabank.app;

import com.parabank.utils.ConfigReader;

import java.util.Properties;

public class TestApp {
    public static void main(String[] args){
        String fileName = "app_config";
        Properties prop = ConfigReader.loadProperties(fileName);
        String url = prop.getProperty("url");
        String username = prop.getProperty("username");
        String password = prop.getProperty("password");

        System.out.println(url);
        System.out.println(username);
        System.out.println(password);

    }
}
