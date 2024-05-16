public class Prenda extends PrototipoPrenda {

  public Prenda(Tipo tipo, Material material, Color colorPrincipal, Color colorSecundario) {
    this.tipo = tipo;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

  public Tipo getTipo() {
    return this.tipo;
  }

  public Material getMaterial() {
    return this.material;
  }

  public Color getColorPrincipal() {
    return this.colorPrincipal;
  }

  public Color getColorSecundario() {
    return this.colorSecundario;
  }
}
