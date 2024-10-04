package com.parabank.utils;

import java.io.*;
import java.util.Properties;

public class ConfigReader {
    public static Properties prop;
    static String rootDir = System.getProperty("user.dir");
    static String resourceDir = "src" + File.separator + "main" + File.separator + "resources";


    public static Properties loadProperties(String fileName){
        prop = new Properties();
        String propFilePath = rootDir + File.separator + resourceDir + File.separator + fileName + ".properties";

        try(InputStream ism = new FileInputStream(propFilePath)){
            prop.load(ism);
        } catch (FileNotFoundException enfe) {
            System.out.println("FILE IS NOT AVAILABLE AT: " + propFilePath);
        } catch (IOException ioe) {
            throw new RuntimeException(ioe);
        }
        return prop;
    }
}
