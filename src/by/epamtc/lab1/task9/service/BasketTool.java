package by.epamtc.lab1.task9.service;


import by.epamtc.lab1.task9.entity.Basket;
import by.epamtc.lab1.task9.entity.Color;

public class BasketTool {
   private Basket basket;

    public BasketTool(Basket basket) {
        this.basket = basket;
    }


    public int countColorBalls(Color color){

        int count=0;
        for (int i = 0; i <basket.getBallsNumber(); i++) {
            if(basket.getBall(i).getColor()==color){
                count++;
            }
        }
        return count;
    }
    public double countWeigh(){
        return basket.getCurrentWeight();
    }
}
