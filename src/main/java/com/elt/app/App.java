package com.elt.app;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        Properties data = new Properties();
        FileInputStream fileLoc = new FileInputStream("./src/main/resources/app.properties");
        data.load(fileLoc);

        eltTech eltDetails = new eltTech(
                data.getProperty("testerId"),
                data.getProperty("testerName"),
                data.getProperty("projectName"),
                data.getProperty("platformName"),
                data.getProperty("platformVersion"),
                data.getProperty("reportTitle")
        );
        Gson gson = new GsonBuilder().create();
        System.out.println("TEST DATA: " + gson.toJson(eltDetails));
    }
}
