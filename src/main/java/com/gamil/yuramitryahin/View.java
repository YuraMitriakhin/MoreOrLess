package com.gamil.yuramitryahin;

public class View {
    public static  String INPUT_MESSAGE = "Input value in the range ";
    public static final String WRONG_INPUT_INT_DATA = "Incorrect value! Repeat please!";
    public static final String WRONG_RANGE = "Incorrect range! Repeat please!";
    public static final String SUCCESS_MESSAGE = "Success! You gueassed number!";
    public static final String STATISTICS_MESSAGE_1 = "You entered ";
    public static final String STATISTICS_MESSAGE_2 = " value, its: ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printMessageInRange(String message, int min, int max){
        System.out.println(message+"]"+min+"-"+max+"[:");
    }
}
