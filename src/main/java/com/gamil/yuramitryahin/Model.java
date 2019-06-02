package com.gamil.yuramitryahin;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private int min;
    private int max;
    private int value;
    private List<Integer> statistics;

    public Model(){
        statistics = new ArrayList<Integer>();
    }

    public void setRange(int min, int max){
        this.min=min;
        this.max=max;
    }

    public boolean checkValue(int value){
        statistics.add(value);
        if(this.value==value){
            return true;
        }else if(value>this.value){
            this.max=value;
        }else{
            this.min=value;
        }
        return false;
    }

    public void randValue(){
        this.value=(int)(Math.random()*(max-1))+(min+1);
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public List<Integer> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<Integer> statistics) {
        this.statistics = statistics;
    }
}
