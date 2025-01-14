package org.gestion_patient.repository;

import org.gestion_patient.entity.PostAccouchement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostAccouchementRepository extends JpaRepository<PostAccouchement,Integer> {
    PostAccouchement findByAccouchementIdAccouchement (int id);
    void deleteAllByAccouchementPatientIdPatient(int id);
    List<PostAccouchement> findAllByAccouchementPatientIdPatient(int id);
}