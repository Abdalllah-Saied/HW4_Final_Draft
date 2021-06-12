package com.packag;
import com.packag.*;
/**
 * 
 * @author abdallah saied salem ,Mohamed Khayri Mohamed ,mohamed wahieed 
 * @version     1.0
 */
public class PlaygroundOwner extends  Player {

public  PlaygroundsList  playgrounds =new PlaygroundsList();
public  boolean isOwner= true;
/**
 * parameterized constructor to set the data
 * @param name
 * @param phone_number
 * @param email
 * @param password 
 */
    public PlaygroundOwner (String name, String phone_number,String email, String password)
    {
        super(name,phone_number,email,password);
    }
    /**
     * default constructor
     */
    PlaygroundOwner(){};
    /**
     * add new playground in the list 
     * @param playground 
     */
    void addPlayground(Playground playground)
    {
        System.out.println();
        playgrounds.add(playground);
    }
/**
 * this function to interacted with user  
 * @param list 
 */
    @Override
    public  void  home(PlaygroundsList list) {
        while (true) {


            int op;

            System.out.println("1)add playground");
            System.out.println("2)see the playgrounds info ");
            System.out.println("3)exit");
            op = input.nextInt();
            if (op == 1) {
                Playground playground1 = new Playground();
                String var;
                double price;
                System.out.println("enter the name of your playground ");
                var = input.next();
                playground1.setName(var);
                System.out.println("enter the address of your playground ");
                var = input.next();
                playground1.setAddress(var);
                System.out.println("enter the price of your playground ");
                price = input.nextDouble();
                playground1.setPrice(price);
                playground1.setOwner(this);
               System.out.println(playground1.toString());
               list.add(playground1);
                playgrounds.allPlayground.add(playground1);



            }
            if (op == 2) {
                for (int i = 0; i < playgrounds.allPlayground.size(); i++) {
                    System.out.print("playground: ");
                    System.out.println(i+1);
                    System.out.println(playgrounds.allPlayground.get(i).toString());
                    playgrounds.allPlayground.get(i).available();
                    System.out.println("-------------------------------------------------");
                }
            }
            if (op == 3) {
                return;
            }

        }

    }
}
