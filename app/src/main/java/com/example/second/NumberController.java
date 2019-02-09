package com.example.second;

import android.widget.EditText;
import android.widget.TextView;

public class NumberController {
     Double value;
     String displayValue;
    TextView display;

    public NumberController() {
        displayValue = new String();
    }

    public void setDisplay(TextView display) {
        this.display = display;
    }


     public void addDigit(int d){
         if((d>0)&&(d<=9)&&(displayValue.length()<12)){
             displayValue=displayValue+Integer.toString(d);
             display();
         }
     }

     public void clear(){
         displayValue="";
         if(display != null){
             if(displayValue.equals("")) {
                 display.setText("0");
             }else{
                 display.setText(displayValue);
             }
         }
     }

     public void clearLastDigit(){
         if(displayValue.length()>0) {
             displayValue = displayValue.substring(0, displayValue.length() - 1);
        display();
         }
     }

     public void display(){
         if(display != null){
             if(displayValue.equals("")) {
                 display.setText("0");
             }else{
                 display.setText(displayValue);
             }
         }
     }
}
