package com.example.temperatureconverter.Model;

public class CalTemp {

    private float temp;

    public CalTemp(){

    }
    public CalTemp(float temp){
        this.temp = temp;
    }

    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public float Cal_CtoF(){
        float Fahrenheit = (float) ((temp*1.8)+32);
        return  Fahrenheit;
    }
    public float Cal_FtoC(){
        float Celsius = (float) ((temp-32)/1.8);
        return Celsius;
    }
}
