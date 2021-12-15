abstract class Vivienda {
  Integer numHabitaciones;
  Integer precioByPersona;

  Vivienda(Integer numHabitaciones, Integer precioByPersona) {
    this.numHabitaciones = numHabitaciones;
    this.precioByPersona = precioByPersona;
  }

  abstract void printBill(){}

  Integer calculateBill(){
    return numHabitaciones * precioByPersona;
  }
}

public class Chalet implements Vivienda {

  Chalet(Integer numHabitaciones, Integer precioByPersona) {
    super(numHabitaciones, precioByPersona);
  }

  @Override
  public void printBill(){
    System.out.println("Precio del Chalet: " + super.calculateBill());
  }
}

public class Piso implements Vivienda {

  Piso(Integer numHabitaciones, Integer precioByPersona) {
    super(numHabitaciones, precioByPersona);
  }

  @Override
  public void printBill(){
    System.out.println("Precio del Piso: " + super.calculateBill());
  }
}

public enum TipoVivienda {
  Piso,
  Chalet
}

public class ViviendaFactory {
  public IPerson getVivienda(TipoVivienda type, Integer numHabitaciones, Integer precioByPersona) {
    switch (type) {
      case TipoVivienda.Chalet:
        return new Chalet(numHabitaciones, precioByPersona);
      case TipoVivienda.Piso:
        return new Piso(numHabitaciones, precioByPersona);
      default:
        throw new Exception("Clase no definida");
    }
  }
}

class MyApplication{  
  public static void main(String args[])throws IOException{
    GetPlanFactory viviendaFactory = new ViviendaFactory();

    Vivienda miChalet = viviendaFactory.getVivienda(TipoVivienda.Chalet, 5, 6000); 
    ...
  } 
}