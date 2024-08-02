class Employee {
    int id;
    String name;

    public Employee() {
        name = "harry";
        id = 22;
    }

    public void setname(String n) {
        this.name = n;

    }

    public String getname() {
        return name;
    }

    public void setid(int i) {
        this.id = i;

    }

    public int getid() {
        return id;
    }

    public void constructor() {
    }

}

public class constructor {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println(emp1.getname());
        System.out.println(emp1.getid());
    }
}