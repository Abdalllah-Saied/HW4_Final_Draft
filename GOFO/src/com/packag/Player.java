package com.packag;
import java.util.*;
/**
 * 
 * @author abdallah saied salem ,Mohamed Khayri Mohamed ,mohamed wahieed 
 * @version     1.0
 */
public class Player {
    Scanner input = new Scanner(System.in);
    public  String name;
    public String phone_number;
    public  String email;
    public String password;
    boolean isOwner=false;
    /**
     * parameterized constructor to set the data
     * @param name
     * @param phone_number
     * @param email
     * @param password 
     */
   public Player (String name, String phone_number,String email, String password)
   {
       this.name=name;
       this.email=email;
       this.phone_number=phone_number;
       this.password=password;
   }
     /**
     * default constructor to set the arr =0
     */
   public Player(){};
   /**
    * setter to name
    * @param name 
    */
    //set name function
    public void setName(String name)
    {
        this.name=name;
    }
    /**
     * setter to phone number 
     * @param phone_number 
     */
    //set phone number function
    public void setPhone_number(String phone_number)
    {
        this.phone_number=phone_number;
    }
    /**
     * setter to email 
     * @param email 
     */
    //set email function
    public void setAccount(String email)
    {
        this.email=email;
    }
    /**
     * setter to password
     * @param password 
     */
    // set password function
    public void setPassword(String password)
    {
        this.password=password;
    }
    /**
     * 
     * @return name of the user 
     */
    //get name function
    public String getName()
    {
        return this.name;
    }
    /**
     * 
     * @return phone number
     */
    //get phone number function
    public String getPhone_number()
    {
        return this.phone_number;
    }
    /**
     * 
     * @return email of the user 
     */
    //get account function
    public String getEmail()
    {
        return this.email;
    }
    /**
     * 
     * @return password 
     */
    //get password function
    public String getPassword()
    {
        return this.password;
    }
    /**
     * 
     * @return user's data 
     */
    @Override
    public String toString ()//to  show data
    {
        return " name: "+this.name+
                "\n phone number : "+this.phone_number +
                "\n email : "+this.email +
                "\n" +" password : "+ this.password;

    }
    /**
     * this function to interacted with user  
     * @param list 
     */
    public void home(PlaygroundsList list)
    {
        int op;
       while (true)
       {
           System.out.println("1)booking playground");
           System.out.println("2) Exit");
           op=input.nextInt();
           if (op==1)
           {
               list.show();
               System.out.println("choice your playground number");
               op=input.nextInt();
               list.allPlayground.get(op-1).available();
               System.out.println("choice your  suitable slot and see if it free or not ");
               op=input.nextInt();
               if(list.allPlayground.get(op-1).arr[op-1]==0)
               {

                   list.allPlayground.get(op-1).arr[op-1]=1;
                   System.out.println("                           good booking");
               }
               else
               {
                   System.out.println("                  error!  not free");
               }



           }
           else
           {
               return;
           }
       }



    }








}

