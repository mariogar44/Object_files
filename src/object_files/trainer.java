/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario
 */
public class trainer extends person
{

    private int matchwin;
    private int matchloose;

    public trainer(int t)
    {
        super(t);
        setMatchwin();
        setMatchloose();
    }
    public trainer(){
    super();
}

    public int getMatchwin()
    {
        return matchwin;
    }

    public int getMatchloose()
    {
        return matchloose;
    }
    public void setMatchloose(int newMatchloose)
    {
        matchloose = newMatchloose;
    }

    public void setMatchloose()
    {
        boolean okey=false;
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("how many macht does the trainer loose?");
        do{
        try
        {
            s = reader.readLine();
            matchloose = Integer.parseInt(s);
        } catch (IOException ex)
        {
            System.out.println("Error");
        }
        if (matchloose > 38 && matchloose < 0){
            System.out.println("You have to enter a number between 0 and 38");
            okey=false;
        }else {
            okey=true;
        }
        }while(okey=false);
    }

    public void setMatchwin(int newMatchwin)
    {
        matchwin = newMatchwin;
    }

    public void setMatchwin()
    {
        boolean okey=false;
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many match does win the trainer?");
        do{
        try
        {
            s = reader.readLine();
            matchwin = Integer.parseInt(s);
        } catch (IOException ex)
        {
            System.out.println("Error");
        }
        if (matchwin > 38 && matchwin < 0){
            System.out.println("You have to enter a number between 0 and 38");
            okey=false;
        }else {
            okey=true;
        }
        }while(okey=false);
    }
}
