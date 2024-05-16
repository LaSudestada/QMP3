public class PrendaBuilder extends PrototipoPrenda {

  //CONSTRUCTOR
  public PrendaBuilder(Tipo tipo) {
    if (tipo == null) {
      throw new RuntimeException("El tipo no puede ser nulo");
    } else {
      this.tipo = tipo;
    }
  }

  public void setMaterial(Material material) {
    if (material == null) {
      throw new RuntimeException("El material no puede ser nulo");
    } else {
      this.material = material;
    }
  }

  public void setTrama(Trama trama) {
    if (trama == null) {
      this.trama = Trama.LISA;
    } else {
      this.trama = trama;
    }
  }

  public void setColorPrincipal(Color colorPrincipal) {
    if (colorPrincipal == null) {
      throw new RuntimeException("El colorPrincipal no puede ser nulo");
    } else {
      this.colorPrincipal = colorPrincipal;
    }
  }

  public void setColorSecundario(Color colorSecundario) {
    this.colorSecundario = colorSecundario;
  }

  private boolean esBuildeable() {
    return (tipo != null) && (material != null) && (trama != null) && (colorPrincipal != null);
  }

  //El motivo por el que usamos el builder
  public void buildPrenda() {
    if (esBuildeable()) {
      new Prenda(tipo, material, colorPrincipal, colorSecundario);
    } else {
      throw new RuntimeException("Falta un parametro para construir la prenda");
    }
  }

}
