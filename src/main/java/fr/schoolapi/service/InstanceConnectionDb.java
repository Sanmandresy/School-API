package fr.schoolapi.service;

import java.sql.*;

public class InstanceConnectionDb {
  public static Connection instanceDbConnection(Login user){
    try{
      return DriverManager.getConnection(user.getUrl(),user.getUserName(),user.getPassword());
    }
    catch (SQLException e){
      throw new RuntimeException(e);
    }
  }
}
