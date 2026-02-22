package com.example.JPA2.repository;

import com.example.JPA2.model.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    @Query("""
   SELECT e.firstName, e.lastName
   FROM Employee e
   WHERE e.salary > (SELECT AVG(emp.salary) FROM Employee emp)
   ORDER BY e.age ASC, e.salary DESC
""")
    List<Object[]> getEmployeesAboveAvg();

    @Query("SELECT AVG(e.salary) FROM Employee e")
    Double getAvgSalary();

    @Modifying
    @Query("UPDATE Employee e SET e.salary = :salary WHERE e.salary < :avg")
    int updateBelowAvg(@Param("salary") double salary,
                       @Param("avg") double avg);

    @Query("select MIN (e.salary) from Employee e ")
    double dsalary();
    @Modifying
    @Query("delete Employee e where e.salary= :min ")
    void deleteMin(Double min);

    @Query(value = "select * from employee_table e where e.emp_last_name= :param ",nativeQuery = true)
    Employee lastName(@Param("param")String p);

    @Modifying
    @Transactional
    @Query(value = "DELETE FROM employee_table WHERE emp_age > :age", nativeQuery = true)
    int deleteAfterAge(@Param("age") int age);

}
