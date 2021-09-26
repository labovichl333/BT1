package by.epamtc.lab1.task9.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Basket implements Serializable {
    public final double DEFAULT_MAX_WEIGHT = 100;
    private double maxWeight;
    private double currentWeight;
    private List<Ball> list;

    public Basket(double maxWeight) {
        this.maxWeight = maxWeight;
        list = new ArrayList<>();
    }

    public Basket() {
        list = new ArrayList<>();
        maxWeight = DEFAULT_MAX_WEIGHT;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public double getCurrentWeight() {
        return currentWeight;
    }

    public int getBallsNumber() {
        return list.size();
    }

    public void addBall(Ball ball) {
        if (ball == null) {
            //Здесь должно быть выброшено  своё исключение
        }
        if (currentWeight + ball.getWeight() <= maxWeight) {
            currentWeight += ball.getWeight();
            list.add(ball);
        } else {
            //Здесь должно быть выброшено  своё исключение
        }
    }

    public Ball getBall(int i) {
        if (i >= list.size() || i < 0) {
            //выбросить своё исключение
        }
        return list.get(i);
    }

    public boolean removeBall(Ball ball) {
        boolean answer = false;
        if (ball == null) {
            //Здесь должно быть выброшено  своё исключение
        }
        if (list.remove(ball)) {
            currentWeight -= ball.getWeight();
            answer = true;
        }
        return answer;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "@" +
                "currentWeight: " + currentWeight +
                " balls: " + list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Double.compare(basket.maxWeight, maxWeight) == 0 &&
                Double.compare(basket.currentWeight, currentWeight) == 0 &&
                list.equals(basket.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxWeight, currentWeight, list);
    }
}
