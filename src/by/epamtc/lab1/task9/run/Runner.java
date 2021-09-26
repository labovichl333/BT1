package by.epamtc.lab1.task9.run;


import by.epamtc.lab1.task9.entity.Ball;
import by.epamtc.lab1.task9.entity.Basket;
import by.epamtc.lab1.task9.entity.Color;
import by.epamtc.lab1.task9.service.BasketTool;

import java.util.LinkedList;

public class Runner {
    public static void main(String[] args) {
        Basket basket=new Basket(156.9);
        basket.addBall(new Ball(15.3, Color.BLUE));
        basket.addBall(new Ball(19.3, Color.GREEN));
        basket.addBall(new Ball(15.7, Color.BLUE));
        basket.addBall(new Ball(15.3, Color.ORANGE));
        basket.addBall(new Ball(12.3, Color.PINK));
        basket.addBall(new Ball(12.7, Color.BLUE));
        basket.addBall(new Ball(19.6, Color.YELLOW));
        
        BasketTool basketTool=new BasketTool(basket);
        int countBlue=basketTool.countColorBalls(Color.BLUE);
        System.out.println("Number of blue balls "+countBlue);
        double weight=basket.getCurrentWeight();
        System.out.println("total weidht "+weight);
        System.out.println(basket.toString());
    }
}
