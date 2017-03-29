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
public class Seasson
{

    private String league;
    private int matchweek;
    private String local;
    private String visitor;
    private String result;

    public Seasson(int q)
    {
        setLeague();
        setMatchweek();
        setLocal();
        setVisitor();
        setResult();

    }

    public String getLeague()
    {
        return league;
    }

    public int getMatchweek()
    {
        return matchweek;
    }
    public String getLocal()
    {
        return local;
    }

    public String getVisitor()
    {
        return visitor;
    }

    public String getResult()
    {
        return result;
    }

    public void setLeague(String newLeague)
    {
        league = newLeague;
    }

    public void setLeague()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a League");
        try
        {
            league = reader.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(FootballTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setMatchweek(int newMatchweek)
    {
        matchweek = newMatchweek;
    }

    public void setMatchweek()
    {
        String s;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Match week");
        try
        {
            s = reader.readLine();
            matchweek = Integer.parseInt(s);
        } catch (IOException ex)
        {
            Logger.getLogger(FootballTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setLocal(String newLocal)
    {
        local = newLocal;
    }

    public void setLocal()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the local team");
        try
        {
            local = reader.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(FootballTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setVisitor(String newVisitor)
    {
        visitor = newVisitor;
    }

    public void setVisitor()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the visitor team");
        try
        {
            visitor = reader.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(FootballTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setResult(String newResult)
    {
        result = newResult;
    }

    public void setResult()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the result of the match");
        try
        {
            result = reader.readLine();
        } catch (IOException ex)
        {
            Logger.getLogger(FootballTeam.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
