public class Client {
    public static void main(String[] args) {
        GelPen gelPen=PenFactory.createGelPen().setCanChangeRefil(true).setRefil(new Refil()).build();

    }
}