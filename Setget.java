package oops_practical;

class std{
    private int ID;
    private String name;
    private String Branch;

    public int getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getBranch(){
        return Branch;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBranch(String branch) {
        this.Branch = branch;
    }
}
class Setget{
    public static void main(String[] args) {
        std student = new std();
        student.setID(387);
        student.setName("Nikhila");
        student.setBranch("CSE");

        System.out.println("Student ID: " + student.getID());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Branch: " + student.getBranch());
    }
} 
