
class Employee {
    private String name;
    private String role;

    public Employee () {}

    public Employee (String name, String role) {
        this.name = name;
        this.role = role;
    }

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
}

class EmployeeRepository {
    public void save (Employee employee) {
        System.out.println("Kullanıcı veritabanına kaydedildi: " + employee.getName());
    }
}

class ReportEmployee {
    public void report (Employee employee) {
        System.out.println("Kullanıcı veri tabanına kaydedildi: " + employee.getName());
    }
}

public class Main {
    
}
