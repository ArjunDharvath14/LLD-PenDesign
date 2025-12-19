import Startegies.writeStaregies.WriteBehaviour;

public class FountainPen extends Pen {
    FountainPen(WriteBehaviour writeBehaviour) {
        super(PenType.FOUNTAIN,writeBehaviour);
    }
    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void write() {

    }
}
