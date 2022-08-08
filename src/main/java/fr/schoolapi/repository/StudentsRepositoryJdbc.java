package fr.schoolapi.repository;

import fr.schoolapi.model.Students;
import fr.schoolapi.service.InstanceConnectionDb;
import fr.schoolapi.service.LoadDriver;
import fr.schoolapi.service.Login;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Optional;

public class StudentsRepositoryJdbc implements StudentsRepository{

  public Connection connectToDatabase(){
    Login user = new Login();
    LoadDriver.loadPgDriver(user.getDriver());
    return InstanceConnectionDb.instanceDbConnection(user);
  }

  @Override
  public List<Students> findAll() {
    List<Students> studentsList = new ArrayList<>();
    try{
      Statement statement = connectToDatabase().createStatement();
      String studentList = "select * from  students;";
      ResultSet list = statement.executeQuery(studentList);
    }
    catch (SQLException e){
      e.printStackTrace();
    }
    return studentsList;
  }

  @Override
  public Students save(Students student) {
    try{
      Statement statement = connectToDatabase().createStatement();
      String newStudent =
          "insert into students(name,groups) values('"+student.getName()+"','"+student.getGroups().getId()+"');";
     statement.executeQuery(newStudent);
    }
    catch (SQLException e){
      e.printStackTrace();
    }
    return student;
  }

  @Override
  public Optional<Students> findById(Long id) {
    try{
      Statement statement = connectToDatabase().createStatement();
      String student = "select * from students where id = "+id;
      statement.executeQuery(student);
    }
    catch (SQLException e){
      e.printStackTrace();
    }
    return Optional.empty();
  }

  @Override
  public void deleteById(Long id) {
    try{
      Statement statement = connectToDatabase().createStatement();
      String studentToDelete = "delete from students where id = "+id;
      statement.executeQuery(studentToDelete);
    }
    catch (SQLException e){
      e.printStackTrace();
    }
  }

  @Override
  public List<Students> findWhereNameLike(String query) {
    try{
      Statement statement = connectToDatabase().createStatement();
      String studentListFiltered = "select name fom students where name iLike %" + query + "% ;";
      statement.executeQuery(studentListFiltered);
    }
    catch (SQLException e){
      e.printStackTrace();
    }

    return List.of();
  }
}
