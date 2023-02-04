package lab6.p3;

public class Converter {
    private String data;
    private String from_unit;
    private String to_unit;
    private int from_value;
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getFrom_unit() {
        return from_unit;
    }

    public void setFrom_unit(String from_unit) {
        this.from_unit = from_unit;
    }

    public String getTo_unit() {
        return to_unit;
    }

    public void setTo_unit(String to_unit) {
        this.to_unit = to_unit;
    }

    public int getFrom_value() {
        return from_value;
    }

    public void setFrom_value(int from_value) {
        this.from_value = from_value;
    }
    public double getAns(){
        if(data.equals("length") && from_unit.equals("meter") && to_unit.equals("centimeter")){
            return from_value*100;
        } else if (data.equals("length") && from_unit.equals("inch") && to_unit.equals("centimeter")) {
            return from_value*2.54;
        } else if (data.equals("temp") && from_unit.equals("celsius") && to_unit.equals("fahrenheit")) {
            return (from_value*9/5)+32;
        }
        else {
            return -1;
        }
//        return data+from_unit+to_unit+from_value;
    }
}
