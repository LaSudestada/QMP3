import java.util.Objects;

public class Material {
//  JEAN,
//  ALGODON, LINO, PIQUE
//  GABARDINA, GASA, LONA,
//  POLIESTER, NEOPRENO, ACETATO
//  SATEN, SEDA, TERCIOPELO,
//  LANA, ALPACA
  Trama trama;

  public Trama getTrama() {
    return trama;
  }

  public Material(Trama trama) {
    this.trama = Objects.requireNonNullElse(trama, Trama.LISA);
  }

  //WKO
  public static Material JEAN = new Material(Trama.LISA);

  public static Material ALGODON_LISO = new Material(Trama.LISA);
  public static Material ALGODON_RAYADO = new Material(Trama.RAYADA);
  public static Material ALGODON_ESTAMPADO = new Material(Trama.ESTAMPADA);

  public static Material PIQUE_LISO = new Material(Trama.LISA);
  public static Material PIQUE_RAYADO = new Material(Trama.RAYADA);
  public static Material PIQUE_CUADRILLE = new Material(Trama.CUADRILLE);
}
