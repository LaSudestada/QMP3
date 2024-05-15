public class Tipo {
//  ZAPATO, ZAPATILLA, BOTA, SANDALIA, OJOTA,
//  CAMISA_MANGA_LARGA, CAMISA_MANGA_CORTA, REMERA, CHOMBA,
//  SACO, CAMPERA, BUZO, SWEATER, CHQUETA,
//  PANTALON_VAQUERO, PANTALON_JOGGIN, CALZA, VERMUDA, SHORT

  Categoria categoria;

  public Categoria getCategoria() {
    return categoria;
  }

  public Tipo(Categoria categoria) {
    this.categoria = categoria;
  }
}
