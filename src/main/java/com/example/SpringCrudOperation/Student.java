package com.example.SpringCrudOperation;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
@Entity
@Table(name = "Student_Table")
public class Student {
    @Id
    int id;
    String name;
    String city;

}
