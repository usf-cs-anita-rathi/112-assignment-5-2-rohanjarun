public class Temperature {
    private float degree = 0;
    private char scale = 'c';
    Temperature(float degree){
        this.degree = degree;
    }
    Temperature(char scale){
        this.scale = scale;
    }
    Temperature(float degree, char scale){
        this.degree = degree;
        this.scale = scale;
    }
    Temperature(){}

    public float getDegreeC() {
        return (5 * (degree - 32)/9);
    }

    public float getDegreeF() {
        return ((9 * (degree) / 5) + 32);
    }

    public void setDegree(float degree) {
        this.degree = degree;
    }

    public char getScale() {
        return scale;
    }

    public void setScaleC(char scale) {
        this.scale = 'c';
    }

    public void setScaleF(char scale) {
        this.scale = 'f';
    }

    public void setScale(char scale1, char scale2){
        this.scale = 'c';
        this.scale = 'f';
    }

    public boolean isEqual(float temp1, float temp2){
        if (temp1 == temp2){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isGreater(float temp1, float temp2){
        if (temp1 > temp2){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isLess(float temp1, float temp2){
        if (temp1 < temp2){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public String toString() {
        if(scale == 'f'){
            return "Fahrenheit to Celcius is: " + getDegreeC();
        }else{
            return "Celcius to Fahrenheit is: " + getDegreeF();
        }

    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Temperature temp = new Temperature();
        System.out.println(temp.toString());

        Temperature temp1 = new Temperature(-40,'c');
        System.out.println(temp1.toString());

        Temperature temp2 = new Temperature(100,'c');
        System.out.println(temp2.toString());

    }

}
