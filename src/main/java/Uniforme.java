public class Uniforme extends PrototipoUniforme {
  //CONSTRUCTOR
  public Uniforme(Prenda calzado, Prenda parteInferior, Prenda parteSuperior) {
    this.calzado = calzado;
    this.parteInferior = parteInferior;
    this.parteSuperior = parteSuperior;
  }

  public Prenda getCalzado() {
    return calzado;
  }

  public Prenda getParteInferior() {
    return parteInferior;
  }

  public Prenda getParteSuperior() {
    return parteSuperior;
  }
}
