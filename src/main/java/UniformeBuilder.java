public class UniformeBuilder extends PrototipoUniforme {
  public void setCalzado(Prenda calzado) {
    this.calzado = calzado;
  }

  public void setParteInferior(Prenda inferior) {
    this.parteInferior = inferior;
  }

  public void setParteSuperior(Prenda superior) {
    this.parteSuperior = superior;
  }

  private boolean esBuildeable() {
    return calzado != null && parteInferior != null && parteSuperior != null;
  }

  public Uniforme buildUniforme() {
    if (esBuildeable()) {
      return new Uniforme(calzado, parteInferior, parteSuperior);
    } else {
      throw new RuntimeException("No se puede crear el uniforme por falta de parametros");
    }
  }
}
