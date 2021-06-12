package com.packag;
import  com.packag.PlaygroundOwner;
import java.util.*;
import java.util.Scanner;
/**
 * 
 * @author abdallah saied salem ,Mohamed Khayri Mohamed ,mohamed wahieed 
 * @version     1.0
 */
public class Playground {
    Scanner input = new Scanner(System.in);
    String name;
    String address;
    double price;
   public int [] arr=new int[12];
    PlaygroundOwner owner;
    int id;
   /**
     * default constructor to set the arr =0
     */
    public Playground()
    {
        for (int i=0;i<12;i++)
        {
            arr[i]=0;// if arr[i] ==0 the the playground  is slot i is free
        }
    }
    /**
     * setter to name
     * @param name 
     */
    public  void setName(String name)
    {
        this.name=name;
    }
    /**
     * setter to address
     * @param address 
     */
    public  void setAddress(String address)
    {
        this.address=address;
    }
    /**
     * setter to price
     * @param price 
     */
    public  void setPrice(double price)
    {
        this.price=price;
    }
    /**
     * setter the owner to the playground
     * @param owner 
     */
    public  void setOwner (PlaygroundOwner owner)
    {
        this.owner=owner;
    }
    /**
     * check if the playground is available to book or not
     */
    public  void available()
    {
        for(int i=0;i<12; i++)
        {
            if(arr[i]==0){
                System.out.println("slot "+(i+1)+" free");

        }
            else {
                System.out.println("slot "+i+1 +"not available ");
            }

        }

    }

/**
 * 
 * @return all data of the playground 
 */
    @Override
    public String toString ()//to  show data
    {
        return  "name: "+this.name+
                "\n address : "+this.address+
                "\n price : "+this.price ;


    }


}
