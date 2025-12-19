import Startegies.writeStaregies.WriteBehaviour;

public class Marker extends Pen  implements RefilPen{
    public Marker(WriteBehaviour writeBehaviour) {
        super(PenType.MARKER,writeBehaviour);
    }

    @Override
    public Colour getColour() {
        return null;
    }

    @Override
    public void write() {

    }

    @Override
    public Refil getRefil() {
        return null;
    }

    @Override
    public boolean canChangeRefil() {
        return false;
    }

    @Override
    public void changeRefil(Refil newRefil) {

    }
}
