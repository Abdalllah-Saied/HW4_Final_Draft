package com.packag;
import com.packag.*;
import java.util.*;
/**
 * 
 * @author abdallah saied salem ,Mohamed Khayri Mohamed ,mohamed wahieed 
 * @version     1.0
 */
public class Main {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // write your code here
        usersList users = new usersList();
        PlaygroundsList playgroundsList=new PlaygroundsList();

        String password, id, email, phone_number,name;
        int choice;

        PlaygroundsList playgrounds = new PlaygroundsList();
        while (true) {

            System.out.println("1) register new user ");
            System.out.println("2) login ");
            System.out.println("3) Exit ");
            choice = input.nextInt();
            if (choice == 1) {

                System.out.println("1) register playground owner");
                System.out.println("2) register new player ");
                System.out.println("3)back");
                choice = input.nextInt();
                if (choice == 1 || choice == 2) {

                    System.out.println("enter your name");
                    name = input.next();

                    System.out.println("enter your phone number ");
                      phone_number = input.next();
                    System.out.println("enter your email  ");
                     email = input.next();
                    System.out.println("enter your password");
                    password = input.next();
                    if (choice == 1) {
                        if (!users.checkIfExist(email, password)) {

                            PlaygroundOwner new_playgroundOwner = new PlaygroundOwner(name, phone_number, email, password);
                            users.register(new_playgroundOwner);


                        }
                    } else {
                        if (!users.checkIfExist(email, password)) {

                            Player player = new Player(name, phone_number, email, password);
                            users.register(player);

                        }
                    }


                }


            }
            else if (choice==2)
            {
                String em;
                String pass;
                System.out.println("enter your Email: ");
                em=input.next();
                System.out.println(em);
                System.out.println("enter your password");
                pass=input.next();
                System.out.println(pass);

                if( users.checkIfExist(em,pass) )
                {
                    System.out.println("good login ");
                    int op;

                       users.getPlayer(em,pass).home(playgrounds);







                }



            }
        }
    }


}











