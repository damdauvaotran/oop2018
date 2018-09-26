package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

class Computer {
    private String brand;
    private boolean isOn;
    private boolean isCrash;

    public Computer(){
        this.brand = "MSI";
        this.isOn = false;
        this.isCrash = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public boolean getIsCrash() {
        return isCrash;
    }

    public void setCrash(boolean crash) {
        isCrash = crash;
    }


    // Ham bat may
    public void turnOn(){
        this.isOn = true;
    }

    //Ham tat may
    public void turnOff(){
        this.isOn = false;
    }

    //Ham bao may hong
    public void crashing() {
        this.isCrash = true;
    }
}

class Human {
    private int age;
    private String name;
    private double weight;

    public Human(int age, String name, double weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //Giam can
    public void lowerWeight(double lower){
        this.weight -= lower;
    }

    //Giam can
    public void increaseWeight(double increase){
        this.weight += increase;
    }
    //Gia di
    public void older(int year){
        this.age = this.age+ year;
    }
}

class space {
    private int numberOfDimemtion ;
    private int unit ;
    private double angle;

    public int getNumberOfDimemtion() {
        return numberOfDimemtion;
    }

    public void setNumberOfDimemtion(int numberOfDimemtion) {
        this.numberOfDimemtion = numberOfDimemtion;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    //Tang so chieu cua khong gian ;
    public void increaseDimention(int i){
        this.numberOfDimemtion+=i;
    }

    //Tinh tien vector don vi
    public void changeUnit (int i){
        this.unit +=i;
    }

    //Tinh don vi dien tich
    public double changeAngle (){
        return this.unit*this.unit*Math.cos(this.angle);
    }
}



