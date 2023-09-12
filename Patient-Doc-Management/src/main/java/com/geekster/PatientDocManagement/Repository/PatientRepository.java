package com.geekster.PatientDocManagement.Repository;

import com.geekster.PatientDocManagement.Model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
