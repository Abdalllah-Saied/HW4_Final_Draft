package com.packag;
import java.util.Scanner;

import  com.packag.Playground;

import java.util.ArrayList;
/**
 * 
 * @author abdallah saied salem ,Mohamed Khayri Mohamed ,mohamed wahieed 
 * @version     1.0
 */
public class PlaygroundsList  {
    ArrayList<Playground> allPlayground = new ArrayList<Playground>();
    /**
     * add new playground in the list  
     * @param playground 
     */
    void add(Playground playground)
    {
        allPlayground.add(playground);
    }

/**
 * display playground's data
 */
void show()
{
    System.out.println("           all playgrounds");
    for (int i=0;i<allPlayground.size();i++)
    {
        System.out.println("                       id: "+(i+1));
        System.out.println(allPlayground.get(i).toString());



       System.out.println("__________________________________________________");
    }
}



}
