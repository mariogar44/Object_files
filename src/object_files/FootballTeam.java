/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_files;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario
 */
public class FootballTeam
{

    
    private String name;
    private String colour1;
    private String colour2;
    private String location;
    private String stadium;
    //constructor

    public FootballTeam(int q)
    {
        
        setName();
        setColour1();
        setColour2();
        setLocation();
        setStadium();
    }

    public FootballTeam(String e)
    {
        
        setName("RealSociedad");
        setColour1("Blue");
        setColour2("White");
        setLocation("Donostia");
        setStadium("Anoeta");
    }


    public String getName()
    {
        return name;
    }

    public String getColour1()
    {
        return colour1;
    }

    public String getColour2()
    {
        return colour2;
    }

    public String getLocation()
    {
        return location;
    }

    public String getStadium()
    {
        return stadium;
    }

    public void setName(String newName)
    {
        name = newName;
    }

    public void setName()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a name for the football team?");
        try
        {
            name = reader.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(FootballTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setColour1(String newColour1)
    {
        colour1 = newColour1;
    }

    public void setColour1()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a principal colour for the football team?");
        try
        {
            colour1 = reader.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(FootballTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setColour2(String newColour2)
    {
        colour2 = newColour2;
    }

    public void setColour2()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a secondary colour for the football team?");
        try
        {
            colour2 = reader.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(FootballTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setStadium(String newStadium)
    {
        stadium = newStadium;
    }

    public void setStadium()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a name for the stadium");
        try
        {
            stadium = reader.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(FootballTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setLocation(String newLocation)
    {
        location = newLocation;
    }

    public void setLocation()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a location");
        try
        {
            location = reader.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(FootballTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   

   

    /**
     * @param args the command line arguments
     */
}
