public class Coche {
  private Integer cavallos;
  private Integer puertas;

  public void setCavallo(Integer cavallos) {
    this.cavallos = cavallos;
  }
  public void setPuertas(Integer puertas) {
    this.puertas = puertas;
  }
}

abstract class CocheBuilder {
  protected Coche coche;

  public Coche getCoche() {
    return coche;
  }

  public abstract void buildCavallos();
  public abstract void builPuertas();
}

 
class BmwCocheBuilder extends CocheBuilder {
  public BmwCocheBuilder(){
    super.coche = new Coche();
  }

  public void buildCavallos() {
    coche.setCavallo(150);
  }

  public void builPuertas() {
    coche.setPuertas(5);
  }
}
 
class FiatCocheBuilder extends CocheBuilder {
  public FiatCocheBuilder() {
    super.coche = new Coche();
  }

  public void buildCavallos() {
    coche.setCavallo(150);
  }

  public void builPuertas() {
    coche.setPuertas(5);
  }
}

class Fabrica {
  private CocheBuilder cocheBuilder;

  public void setCocheBuilder(CocheBuilder cocheBuilder) {
    this.cocheBuilder = cocheBuilder;
  }

  public Coche getCoche() {
    return cocheBuilder.Coche();
  }

  public void buildCoche() {
    cocheBuilder.buildCavallos();
    cocheBuilder.builPuertas();
  }
}

class MyApplication {
  public static void main(String[] args) {
    Cocina fabrica = new Fabrica();
    CocheBuilder fiatCocheBuilder = new FiatCocheBuilder();

    fabrica.setCocheBuilder(fiatCocheBuilder);
    fabrica.buildCoche();

    Coche miCoche = fabrica.getCoche();
  }
}