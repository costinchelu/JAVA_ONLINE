public class TabbedString {

    public static void main(String[] args) {

        SomeString someString = new SomeString();
        someString.setSir("ceva text");
        System.out.println(someString.toString());

        someString.setSir("ceva mai    mult text. Si mai mult text...");
        System.out.println(someString.toString());
    }
}

class SomeString {

    private String sir;
    private double cantitate = 24.44;

    public void setSir(String sir) {
        this.sir = sir;
    }

    @Override
    public String toString() {
        if (sir.length() < 20) {
            sir = sir + "                  ";
        }
        if (sir.length() > 20) {
            sir = sir.substring(0, 20);
        }
        return sir + " : [STOC] : " + cantitate;
    }
}