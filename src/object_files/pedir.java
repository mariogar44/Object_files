package object_files;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario
 */
public class pedir
{
    public static int readInt (){
        String s;
        int value = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            s = reader.readLine();
            value = Integer.parseInt(s);
        } catch (IOException ex)
        {
            Logger.getLogger(pedir.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
        
    }

public static float readFloat(){
String s;
        float value = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            s = reader.readLine();
            value = Float.parseFloat(s);
        } catch (IOException ex)
        {
            Logger.getLogger(pedir.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
      
        
    }
public static double readDouble(){
String s;
        double value = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            s = reader.readLine();
            value = Integer.parseInt(s);
        } catch (IOException ex)
        {
            Logger.getLogger(pedir.class.getName()).log(Level.SEVERE, null, ex);
        }
        return value;
      
        
    }
public static String readString(){
String s = null;
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            s = reader.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(pedir.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
      
        
    }
}