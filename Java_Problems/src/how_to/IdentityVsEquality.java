package how_to;

public class IdentityVsEquality {

    public static void main(String[] args) {

        Human human1 = new Human("John");
        Human human2 = new Human("John");

        boolean identical = human1.equals(human2);

        System.out.println("EQUALITY: " + identical);

        System.out.println("IDENTITY: " + (human1 == human2));

        int a = human1.hashCode();
        int b = human2.hashCode();
        System.out.println("Hashcodes: " + a + "    " + b);
    }
}

class Human {

    private String name;

    public Human(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

// override equals for the particular case of how_to.Human class
    @Override
    public boolean equals(Object obj) {
        if(obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.getName() == ((Human) obj).getName();
    }
}
