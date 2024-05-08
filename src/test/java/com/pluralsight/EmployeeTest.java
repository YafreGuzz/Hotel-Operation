package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void punchIn()
    {
        Employee employee = new Employee("999", "Sekwang Chia", "CertifiedT", 0.50, 100);
        double expectedPunchInTime = 10.00;
        //Act
        employee.punchIn(10);
        //Assert
        assertEquals(expectedPunchInTime, employee.getTime());
    }

    @Test
    void punchOut()
    {
        Employee employee  = new Employee("999", "Sekwang Chia", "CertifiedT", 0.50, 100);

        //Arrange

        double expectedHoursWorked = 114;

        //Act

        employee.punchIn(1);
        employee.punchOut(15);

        //Assert

        assertEquals(expectedHoursWorked, employee.getHoursWorked());
    }
}