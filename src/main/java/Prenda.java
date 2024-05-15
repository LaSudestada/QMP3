public class Prenda {
  Tipo tipo;
  Categoria categoria;
  Material material;
  Color colorPrincipal;
  Color colorSecundario;


  public Prenda(Tipo tipo, Categoria categoria, Material material, Color colorPrincipal) {
    new Prenda(tipo, categoria, material, colorPrincipal, null);
  }

  public Prenda(Tipo tipo, Categoria categoria, Material material, Color colorPrincipal, Color colorSecundario) {
    this.tipo = tipo;
    this.categoria = categoria;
    this.material = material;
    this.colorPrincipal = colorPrincipal;
    this.colorSecundario = colorSecundario;
  }

}
