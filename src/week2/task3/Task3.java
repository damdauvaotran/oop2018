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

