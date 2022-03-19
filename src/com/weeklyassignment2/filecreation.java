package com.weeklyassignment2;

import java.io.FileWriter;

public class filecreation {
    public static void main(String[] args) {
        try
        {
            FileWriter m=new FileWriter("data.txt");
            m.write("happy new year");
            m.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
