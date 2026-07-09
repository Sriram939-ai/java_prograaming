import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class Policy {


    private String policyName;
    private String expiryDate;

    public Policy(String policyName, String expiryDate) {
        this.policyName = policyName;
        this.expiryDate = expiryDate;
    }

    public String getPolicyName() {
        return policyName;
    }

    public String getExpiryDate() {
        return expiryDate;
    }


}





class Employee {
    private String employeeName;
    private List<Policy> policies;

    public Employee(String employeeName, List<Policy> policies) {
        this.employeeName = employeeName;
        this.policies = policies;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

}




class EmployeePolicyDto{
    private String employeeName;
    private String policyName;
    private String expiryDate;

    public EmployeePolicyDto(String employeeName, String policyName, String expiryDate) {
        this.employeeName = employeeName;
        this.policyName = policyName;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "EmployeePolicyDto{" +
                "employeeName='" + employeeName + '\'' +
                ", policyName='" + policyName + '\'' +
                ", expiryDate='" + expiryDate + '\'' +
                '}';
    }



    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee("rahul", Arrays.asList(new Policy("hdfc", "2030"),
                        new Policy("Lic", "2030"))));
//                        new Employee("rahul" , Arrays.asList(new Policy("max life","2030"),
//                        new Policy("icici","2030"))));

          List<EmployeePolicyDto> result = employees.stream().flatMap(employee -> employee.getPolicies()
                .stream().map(policy ->
                        new EmployeePolicyDto(employee.getEmployeeName(),policy.getPolicyName(),policy.getExpiryDate()))).collect(Collectors.toList());
result.forEach(System.out::println);
    }
}
