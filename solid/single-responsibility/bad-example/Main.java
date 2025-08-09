class Employee {
    private String name;
    private String role;

    public Employee () {}

    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public String getRole () {
        return role;
    }
    public void setRole (String role) {
        this.role = role;
    }

    public void saveToDatabase (Employee emp) {
        System.out.println("Veri tabanına kaydedildi: " + emp.getName());
    }

    public void generateReport (Employee emp) {
        System.out.println("Rapor oluşturuldu: " + emp.getName());
    }
}

public class Main {
    public static void main(String[] args){

    }
}