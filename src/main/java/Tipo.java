public class Tipo {
//  ZAPATO, ZAPATILLA, BOTA, SANDALIA, OJOTA,
//  CAMISA_MANGA_LARGA, CAMISA_MANGA_CORTA, REMERA, CHOMBA,
//  SACO, CAMPERA, BUZO, SWEATER,
//  PANTALON, CALZA, VERMUDA, SHORT, POLLERA, FALDA

  Categoria categoria;

  public Categoria getCategoria() {
    return categoria;
  }

  public Tipo(Categoria categoria) {
    this.categoria = categoria;
  }


  public static Tipo ZAPATO = new Tipo(Categoria.CALZADO);
  public static Tipo ZAPATILLA = new Tipo(Categoria.CALZADO);
  public static Tipo BOTA = new Tipo(Categoria.CALZADO);
  public static Tipo SANDALIA = new Tipo(Categoria.CALZADO);
  public static Tipo OJOTA = new Tipo(Categoria.CALZADO);

  public static Tipo PANTALON = new Tipo(Categoria.PARTE_INFERIOR);
  public static Tipo CALZA = new Tipo(Categoria.PARTE_INFERIOR);
  public static Tipo VERMUDA = new Tipo(Categoria.PARTE_INFERIOR);
  public static Tipo SHORT = new Tipo(Categoria.PARTE_INFERIOR);
  public static Tipo POLLERA = new Tipo(Categoria.PARTE_INFERIOR);
  public static Tipo FALDA = new Tipo(Categoria.PARTE_INFERIOR);

  public static Tipo CAMISA_MANGA_LARGA = new Tipo(Categoria.PARTE_SUPERIOR);
  public static Tipo CAMISA_MANGA_CORTA = new Tipo(Categoria.PARTE_SUPERIOR);
  public static Tipo REMERA = new Tipo(Categoria.PARTE_SUPERIOR);
  public static Tipo CHOMBA = new Tipo(Categoria.PARTE_SUPERIOR);
  public static Tipo SACO = new Tipo(Categoria.PARTE_SUPERIOR);
  public static Tipo CAMPERA = new Tipo(Categoria.PARTE_SUPERIOR);
  public static Tipo BUZO = new Tipo(Categoria.PARTE_SUPERIOR);
  public static Tipo SWEATER = new Tipo(Categoria.PARTE_SUPERIOR);
}
