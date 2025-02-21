package springintro.api.component;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeBean {

    private int id;
    private String ename;

    @Autowired
    private DepartmentBean department;
    // Getter methods

    public int getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }
    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getDepartmentName() {
        return department.getDepartmentName();
    }
}
