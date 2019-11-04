package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Order;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.Observable;

public class Tablet extends Observable {
   private final int number;
    //private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public void  createOrder() {
        Order order = null;
        try
        {
            order = new Order(this);
            ConsoleHelper.writeMessage(order.toString());
            if(!order.isEmpty())
            {
//                try
//                {
//                    new AdvertisementManager(order.getTotalCookingTime()*60).processVideos();
//                }
//                catch (NoVideoAvailableException e)
//                {
//                  //  logger.log(Level.INFO, "No video is available for the order " + order);
//                }
                setChanged();
                notifyObservers(order);
            }
        }
        catch (IOException e)
        {
          //  logger.log(Level.SEVERE, "Console is unavailable.");
        }
       // return order;
    }


    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
}