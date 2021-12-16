// ConexUtil puede se una clase que hace una conexion con
// una bbdd por ejemplo
public class UtilSingleton {
  private static UtilSingleton instance;
  private ConexUtil myConex;
  
  private UtilSingleton () {
    myConx = new ConexUtil()
  }

  public static UtilSingleton getInstance() {
    if (myConex == null) {
      myConx = new ConexUtil()
    }
    return myConx;
  }

  public getConex() {
    return myConex;
  }
}

public class MyApplication {
    public static void main(String[] args) {
        UtilSingleton myUtilSingleton = UtilSingleton.getInstance();
        // Use this cnoex
        myUtilSingleton.getConex() ... 
    }
}