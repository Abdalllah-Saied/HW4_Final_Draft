package com.packag;
import  com.packag.*;

import java.util.ArrayList;
/**
 * 
 * @author abdallah saied salem ,Mohamed Khayri Mohamed ,mohamed wahieed 
 * @version     1.0
 */
public class usersList {
ArrayList<Player> users= new ArrayList<>();
/**
 * add new player 
 * @param player 
 */
public  void register(Player player)
{
    users.add(player);
}
/**
 * search with email and password 
 * @param Email
 * @param password
 * @return return true if user exist ,false if not exist 
 */
 public boolean checkIfExist(String Email,String password)
{
    for (int i=0;i<users.size();i++)
    {
        if (Email.equals(users.get(i).email) && password.equals(users.get(i).password))
        {

            return true;

        }
    }

    return false;
}
/**
 * search with email and password 
 * @param email
 * @param password
 * @return return user if exist 
 */
public Player getPlayer(String email,String password)
{
    int i;
    for ( i=0;i<users.size();i++)
    {
        if (email.equals(users.get(i).email) && password.equals(users.get(i).password))
        {
           return users.get(i);
        }
    }
    return users.get(i);
}
/**
 * display user's data 
 */
public  void show()
{
    for (int i=0;i<users.size();i++)
    {
        System.out.println("_______________________________________________");
        System.out.println(users.get(i).toString());
        System.out.println("________________________________________________");
    }
}



}
