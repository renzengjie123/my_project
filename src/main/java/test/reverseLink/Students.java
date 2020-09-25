package test.reverseLink;

public class Students {

    private String name = "";
    private int credit;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students(String name, int credit, int age) {
        this.name = name;
        this.credit = credit;
        this.age = age;
    }

    public void show(){
        System.out.println("Name " + this.name + " Credit" + this.credit + " Age " + this.age);
    }
}
