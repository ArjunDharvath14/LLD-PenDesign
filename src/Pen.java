import Startegies.writeStaregies.SmoothWriteBehaviour;
import Startegies.writeStaregies.WriteBehaviour;

public abstract class Pen {

    private String name;
    private String company;
    private Integer price;
    private PenType type;
    private WriteBehaviour writeBehaviour;
    public Pen(PenType penType,WriteBehaviour writeBehaviour) {
        this.type = penType;
        this.writeBehaviour=writeBehaviour;
    }
    public void write(){
        this.writeBehaviour.write();
    }
    public abstract Colour getColour();
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getCompany() {
        return company;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getPrice() {
        return price;
    }
    public void setType(PenType type) {
        this.type = type;
    }
    public PenType getType() {
        return type;
    }
}
