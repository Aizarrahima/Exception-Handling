package CloneNotSupportedException;

public class MyName implements Cloneable {

    private String name;

    public MyName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Object clone() throws CloneNotSupportedException {
        return (MyName) super.clone();
    }

    public static void main(String[] args) {
        MyName a = new MyName("Aizar");
        try {
            MyName b = (MyName) a.clone();
            System.out.println(b.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
