/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario
 */
public class player extends person implements  Serializable
{

    private int goals;
    private int red_card;
    private int yellow_card;
    private int match;

    public player(int e)
    {
        super(e);
        setGoals();
        setMatch();
        setRed_card();
        setYellow_card();

    }
    public player () {
     super();   
    }
            


    public int getGoals()
    {
        return goals;
    }

    public int getRed_card()
    {
        return red_card;
    }

    public int getYellow_card()
    {
        return yellow_card;
    }

    public int getMatch()
    {
        return match;
    }

    
    public void setGoals(int newGoals)
    {
        goals = newGoals;
    }

    public void setGoals()
    {
        boolean okey = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do{
        System.out.println("Enter number of goals");
        try
        {
            String s = reader.readLine();
            goals = Integer.parseInt(s);
        } catch (IOException ex)
        {
            System.out.println("Error");
        }
        if (goals> 100 && goals < 0){
            System.out.println("You have to enter a number between 0 and 100");
            okey=false;
        }else {
            okey=true;
        }
        }while(okey=false);
    }

    public void setRed_card(int newRed_card)
    {
        red_card = newRed_card;
    }

    public void setRed_card()
    {
        boolean okey=false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do{
        System.out.println("Enter Red cards");
        try
        {
            String s = reader.readLine();
            red_card = Integer.parseInt(s);
        } catch (IOException ex)
        {
            System.out.println("Error");
        }
        if (red_card > 19 && red_card < 0){
            System.out.println("You have to enter a number between 0 and 19");
            okey=false;
        }else {
            okey=true;
        }
        }while(okey=false);
    }

    public void setYellow_card(int newYellow_card)
    {
        yellow_card = newYellow_card;
    }

    public void setYellow_card()
    {
       boolean okey=false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do{
        System.out.println("Enter Yellow cards");
        try
        {
            String s = reader.readLine();
            yellow_card = Integer.parseInt(s);
        } catch (IOException ex)
        {
            System.out.println("Error");
        }
         if (yellow_card > 38 && yellow_card < 0){
            System.out.println("You have to enter a number between 0 and 38");
            okey=false;
        }else {
            okey=true;
        }
        }while(okey=false);
    }

    public void setMatch(int newMatch)
    {
        match = newMatch;
    }

    public void setMatch()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean okey=false;
        do{
        System.out.println("Enter number of matches");
        try
        {
            String s = reader.readLine();
            match = Integer.parseInt(s);
        } catch (IOException ex)
        {
            System.out.println("Error");
        }
        if (match > 38 && match < 0){
            System.out.println("You have to enter a number between 0 and 38");
            okey=false;
        }else {
            okey=true;
        }
        }while(okey=false);
    }
}
