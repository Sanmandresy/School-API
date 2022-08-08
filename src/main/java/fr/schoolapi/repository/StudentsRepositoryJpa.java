package fr.schoolapi.repository;

import fr.schoolapi.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepositoryJpa extends JpaRepository<Students,Long> {
}
