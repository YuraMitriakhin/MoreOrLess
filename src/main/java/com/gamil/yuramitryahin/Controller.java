package com.gamil.yuramitryahin;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }


    public void process(){
        Scanner sc = new Scanner(System.in);
        model.setRange(0,100);
        model.randValue();

        while (true){
            int value = inputValueWithScanner(sc);

            if(value>model.getMin() && value < model.getMax()){
                if(model.checkValue(value)){
                    view.printMessage(View.SUCCESS_MESSAGE);
                    view.printMessage(View.STATISTICS_MESSAGE_1+model.getStatistics().size()+View.STATISTICS_MESSAGE_2+model.getStatistics().toString());
                    break;
                }
            }else{
                view.printMessage(View.WRONG_RANGE);
            }
        }
    }

    public int inputValueWithScanner(Scanner sc){
        view.printMessageInRange(view.INPUT_MESSAGE, model.getMin(), model.getMax());
        while( ! sc.hasNextInt()) {
            view.printMessage(View.WRONG_INPUT_INT_DATA);
            view.printMessageInRange(view.INPUT_MESSAGE, model.getMin(), model.getMax());
            sc.next();
        }

        return sc.nextInt();
    }
}
