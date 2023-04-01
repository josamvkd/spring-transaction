package com.josamtechie.spring.transaction.repository;

import com.josamtechie.spring.transaction.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
