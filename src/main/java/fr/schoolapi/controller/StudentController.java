package fr.schoolapi.controller;

import fr.schoolapi.model.Students;
import fr.schoolapi.repository.StudentsRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

  private StudentsRepository repository ;

  @GetMapping("/students")
  public List<Students> findAll(){
    return repository.findAll() ;
  }
  @PostMapping("/students")
  public Students addStudent(Students student){
    return repository.save(student);
  }

  @GetMapping("/students")
  public Optional<Students> findByID(@RequestParam("id") Long id, @RequestParam("name") String newName){
    return repository.findById(id);
  }

  @DeleteMapping("/students/{id_student}")
  public String deleteStudent(@PathVariable Long id_student){
    repository.deleteById(id_student);
    return "Student deleted !";
  }

  @GetMapping("/students/filter")
  public List<Students> findWhereNameLike(@RequestParam(name = "q", required = true) String query){
    return repository.findWhereNameLike(query);
  }

}
