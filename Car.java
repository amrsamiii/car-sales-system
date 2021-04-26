package carapp;

public class Car {

    protected String type;     //manufacturer type
    protected String model;    //model name
    protected int year;        //year of purchase
    protected String color;
    protected String condition;    //used or new
    protected String transmition_type;   //automatic or manual
    protected String payment_option;      //visa or cash
    protected long kilometers;
    protected int engine_capacity;
    protected long price;

    public Car(String type, String model, int year, String color, String condition, String transmition_type, String payment_option, long kilometers, int engine_capacity, long price) {

        this.type = type;
        this.model = model;
        this.year = year;
        this.color = color;
        this.condition = condition;
        this.transmition_type = transmition_type;
        this.payment_option = payment_option;
        this.kilometers = kilometers;
        this.engine_capacity = engine_capacity;
        this.price = price;
    }

    public Car() {

    }

    public void setType(String type) {
        this.type = type;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }


    public void setTransmition_type(String transmition_type) {
        this.transmition_type = transmition_type;
    }

    public void setPayment_option(String payment_option) {
        this.payment_option = payment_option;
    }

    public void setKilometers(long kilometers) {
        this.kilometers = kilometers;
    }

    public void setEngine_capacity(int engine_capacity) {
        this.engine_capacity = engine_capacity;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getCondition() {
        return condition;
    }


    public String getTransmition_type() {
        return transmition_type;
    }

    public String getPayment_option() {
        return payment_option;
    }

    public long getKilometers() {
        return kilometers;
    }

    public int getEngine_capacity() {
        return engine_capacity;
    }

    public long getPrice() {
        return price;
    }
}