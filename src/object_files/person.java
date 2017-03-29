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
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.io.*;
import java.util.*;

/**
 *
 * @author Mario
 */
public class person implements Serializable {

    private String name;
    private LocalDate date;
    private int nan;
    private String team;

    //constructor
    public person(int d) {
        setName();
        setDate();
        setNan();
        setTeam();

    }
    public person(){
        
    }

    public person(String nam, LocalDate da, int dni) {
        name = nam;
        date = da;
        nan = dni;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getNan() {
        return nan;
    }

    public void setDate(LocalDate newDate) {
        date = newDate;
    }

    public String getTeam() {
        return team;
    }

    public void setDate() {
        String s;
        String date2 = "01-01-1940";
        String date3 = "12-12-2017";
        int x = 1,i = 0;
        boolean correct = false;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M-d-y", Locale.ENGLISH);
        do {
            do {
                x=1;
                System.out.println("Enter a date MM-DD-YYYY");
                try {
                    s = reader.readLine();

                    date = LocalDate.parse(s, formatter);
                    
                    

                } catch (Exception date) {
                    System.out.println("The date has error, you have to enter in this format(MM-DD-YYYY)");
                    x = 0;
                }
                } while (x == 0);

                LocalDate historydate = LocalDate.parse(date2, formatter);
                LocalDate date_today = LocalDate.parse(date3,formatter);
                if (date.isAfter(historydate) && date.isBefore(date_today)) {
                   i=1;
                   break;
                } else {
                    System.out.println("You have enter a bad date");
                 i = 0;
                }
            } while (i==0);
        
    }
 
    public void setName(String newName) {
        name = newName;
    }

    public void setName() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a name ?");
        try {
            name = reader.readLine();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

    public void setNan(int newNan) {
        nan = newNan;
    }

    public void setNan() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        boolean okey = false;
        int x=0;
        int dni;
        String s = null;
        do{
            x=1;
        System.out.println("Enter a nan of a person?");
        try {
           s = reader.readLine();
        } catch (IOException ex) {
            System.out.println("Error");
        }
       int length= s.length();
       if (length !=8 ){
           System.out.println("The nan has to have 8 characters ");
          x=0;
       }else {
           dni=Integer.parseInt(s);
           nan=dni;
           okey = true;
       }
    }while (x==0);
    }

    public void setTeam(String newTeam) {
        team = newTeam;
    }

    public void setTeam() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a team name");
        try {
            team = reader.readLine();
        } catch (IOException ex) {
            System.out.println("Error");
        }
    }

}
