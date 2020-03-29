package optional;

import java.util.Optional;

public class Employee {
    private Optional<Integer> id;
    private Optional<String> name;

    public Employee(Optional<Integer> id, Optional<String> name) {
        this.id = id;
        this.name = name;
    }

    public Optional<Integer> getId() {
        return id;
    }

    public Optional<String> getName() {
        return name;
    }

    public static void main(String[] args) {
        Employee employee = new Employee(Optional.of(1), Optional.of("John"));
        Optional<Employee> optionalEmployee = Optional.of(employee);
        Optional<Optional<String>> mapEmp = optionalEmployee.map(Employee::getName);
        Optional<String> flatMapEmp = optionalEmployee.flatMap(Employee::getName);

        mapEmp.ifPresent(System.out::println);
        flatMapEmp.ifPresent(System.out::println);
    }
}
