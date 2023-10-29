package com.example.SpringCrudOperation;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Stud_repository extends JpaRepository<Student, Integer>
{
}
