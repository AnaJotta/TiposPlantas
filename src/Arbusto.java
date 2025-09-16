public class Arbusto extends Plantas{

  private int ancho;
  private boolean esDomestico;
  private String variedadArbusto;
  private String colorHojas;
  private boolean sePoda;

  public Arbusto() {
  }

  public Arbusto(String nombre, double altoDelTallo, boolean tieneHojas, String climaIdeal, int ancho, boolean esDomestico, String variedadArbusto, String colorHojas, boolean sePoda) {
    super(nombre, altoDelTallo, tieneHojas, climaIdeal);
    this.ancho = ancho;
    this.esDomestico = esDomestico;
    this.variedadArbusto = variedadArbusto;
    this.colorHojas = colorHojas;
    this.sePoda = sePoda;
  }

  public int getAncho() {
    return ancho;
  }

  public void setAncho(int ancho) {
    this.ancho = ancho;
  }

  public boolean isEsDomestico() {
    return esDomestico;
  }

  public void setEsDomestico(boolean esDomestico) {
    this.esDomestico = esDomestico;
  }

  public String getVariedadArbusto() {
    return variedadArbusto;
  }

  public void setVariedadArbusto(String variedadArbusto) {
    this.variedadArbusto = variedadArbusto;
  }

  public String getColorHojas() {
    return colorHojas;
  }

  public void setColorHojas(String colorHojas) {
    this.colorHojas = colorHojas;
  }

  public boolean isSePoda() {
    return sePoda;
  }

  public void setSePoda(boolean sePoda) {
    this.sePoda = sePoda;
  }

  @Override
  public void decirLoQueSoy() {
    System.out.println("Hola soy un arbusto");
  }

}
