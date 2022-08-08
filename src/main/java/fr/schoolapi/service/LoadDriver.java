package fr.schoolapi.service;

public class LoadDriver {
  public static void loadPgDriver(String driver){
    try{
      Class.forName(driver);
    }
    catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
