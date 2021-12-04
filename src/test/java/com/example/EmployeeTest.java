package com.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EmployeeTest {

  private EmployeeUtils employeeUtils = new EmployeeUtils();

  @Test
  void employeeFullName() {
    Employee employee = new Employee();
    employee.setFirstName("FirstName");
    employee.setLastName("SecondName");

    String actual = employeeUtils.getFullName(employee);

    assertThat(actual).isEqualTo("FirstName SecondName");
  }

  @Test
  void employeeManagersLastName() {
    Employee employee1 = new Employee();
    Employee employee2 = new Employee();
    employee2.setLastName("SecondName");
    employee1.setManager(employee2);

    String actual = employeeUtils.getManagersLastName(employee1);

    assertThat(actual).isEqualTo("SecondName");
  }

  @Test
  void employeeInEmploymentLongerThanFiveYears() {
    Employee employee = new Employee();
    employee.setYearsOfService(20);

    Boolean actual = employeeUtils.hasBeenEmployedLongerThanFiveYears(employee);

    assertThat(actual).isTrue();
  }

  @Test
  void employeeHasMoreThanThreeDirectReports() {
    Employee employee = new Employee();
    employee.setNumberOfDirectReports(5);

    Boolean actual = employeeUtils.hasMoreThanThreeDirectReports(employee);

    assertThat(actual).isTrue();
  }

  @Test
  void employeeHasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports() {
    Employee employee = new Employee();
    employee.setYearsOfService(5);
    employee.setNumberOfDirectReports(1);

    Boolean actual = employeeUtils.hasMoreThanThreeYearsOfServiceAndLessThanTwoDirectReports(employee);

    assertThat(actual).isTrue();
  }

}
