package fr.schoolapi.repository;

import fr.schoolapi.model.Students;
import java.util.*;
import org.springframework.data.jpa.repository.Query;

public interface StudentsRepository {

  @Query("select student from Students student")
  List<Students> findAll();

  Students save(Students student);

  Optional<Students> findById(Long id);

  void deleteById(Long id);

  List<Students> findWhereNameLike(String query);
}
