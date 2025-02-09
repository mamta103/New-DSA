package structure.design.pattern.solid;

public class Address {
    private String firstADdress;
    private String secondAddress;
    private String city;
    private String state;


    public String getFirstADdress() {
        return firstADdress;
    }

    public void setFirstADdress(String firstADdress) {
        this.firstADdress = firstADdress;
    }

    public String getSecondAddress() {
        return secondAddress;
    }

    public void setSecondAddress(String secondAddress) {
        this.secondAddress = secondAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
