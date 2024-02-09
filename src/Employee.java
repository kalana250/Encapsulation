public class Employee {

    private String name;
    private int id;
    private String contanct_no;
    private double slary;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getId (){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getContanct_no(){
        return contanct_no;
    }

    public void setContanct_no(String contanct_no) {
        this.contanct_no = contanct_no;
    }

    public double getSlary() {
        return slary;
    }

    public void setSlary(double slary) {
        this.slary = slary;
    }
}

class EmployeeDocument{

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Amal");
        e.setId(1234);
        e.setContanct_no("0123456789");
        e.setSlary(35000);
        System.out.println("Employee name is :- " + e.getName() );
        System.out.println(e.getName()+"'s id is :- " + e.getId());
        System.out.println(e.getName()+"'s contact_no is :- " + e.getContanct_no());
        System.out.println(e.getName()+"'s salary is:- " + e.getSlary());
    }
}