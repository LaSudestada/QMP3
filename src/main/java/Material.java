import java.util.Objects;

public class Material {
//  JEAN,
//  ALGODON, LINO,
//  GABARDINA, GASA, LONA,
//  POLIESTER, NEOPRENO,
//  SATEN, SEDA, TERCIOPELO,
//  LANA, ALPACA
  Trama trama;

  public Trama getTrama() {
    return trama;
  }

  public Material(Trama trama) {
    this.trama = Objects.requireNonNullElse(trama, Trama.LISA);
  }

}
