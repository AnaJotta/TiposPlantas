public class Flor extends Plantas{

  private String colorDePetalos;
  private int cantidadPromedioPetalos;
  private String colorPistilo;
  private String variedadFlor;
  private String estacionFlorece;

  public Flor() {
  }
  public Flor(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, String colorDePetalos, int cantidadPromedioPetalos, String colorPistilo, String variedadFlor, String estacionFlorece) {
    super(nombre, altoDelTallo, tieneHojas, climaIdeal);
    this.colorDePetalos = colorDePetalos;
    this.cantidadPromedioPetalos = cantidadPromedioPetalos;
    this.colorPistilo = colorPistilo;
    this.variedadFlor = variedadFlor;
    this.estacionFlorece = estacionFlorece;
  }

  public String getColorDePetalos() {
    return colorDePetalos;
  }

  public void setColorDePetalos(String colorDePetalos) {
    this.colorDePetalos = colorDePetalos;
  }

  public int getCantidadPromedioPetalos() {
    return cantidadPromedioPetalos;
  }

  public void setCantidadPromedioPetalos(int cantidadPromedioPetalos) {
    this.cantidadPromedioPetalos = cantidadPromedioPetalos;
  }

  public String getColorPistilo() {
    return colorPistilo;
  }

  public void setColorPistilo(String colorPistilo) {
    this.colorPistilo = colorPistilo;
  }

  public String getVariedadFlor() {
    return variedadFlor;
  }

  public void setVariedadFlor(String variedadFlor) {
    this.variedadFlor = variedadFlor;
  }

  public String getEstacionFlorece() {
    return estacionFlorece;
  }

  public void setEstacionFlorece(String estacionFlorece) {
    this.estacionFlorece = estacionFlorece;
  }

  @Override
  public void decirLoQueSoy() {
    System.out.println("Hola soy una flor");
  }


}
