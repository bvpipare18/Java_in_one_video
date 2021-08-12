class Student {
    private int roll_no;
    private String name;

    // Getter & Setter
    // public void setRoll_no(int r) {
    // int roll_no = r;
    // }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
        System.out.println("value of rollno changed");
    }

    public int getRoll_no() {
        System.out.println("user is accessing the value");
        return roll_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRoll_no(37);
        s1.setName("Will");

        System.out.println(s1.getRoll_no());
        System.out.println(s1.getName());
    }
}
