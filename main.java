class Main {
    public static void main(String[] args) {
        StringBasics stringBasics = new StringBasics();
        stringBasics.display();

        demo demo = new demo();
        System.out.println(demo); //When ever you called the reference, toString() will be invoked
        System.out.println(demo.toString());
    }
}

class demo{
    String s = "Yeswanth";
    int id = 10;
}