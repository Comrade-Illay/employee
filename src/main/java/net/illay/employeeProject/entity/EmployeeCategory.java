package net.illay.employeeProject.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "employee_category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeeCategory implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long employeeCategoryId;

    @Column(name = "name")
    private String categoryName;

    @JsonIgnore
    @OneToMany(mappedBy = "employeeCategory", fetch = FetchType.LAZY)
    @JsonIgnoreProperties("employeeCategory")
    private Set<Employee> employees;
}
