import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Guardarropa {
  List<Uniforme> uniformes = new ArrayList<Uniforme>();
  List<Prenda> prendas = new ArrayList<>();

  ////////////////////////////////////////////////////

  public void guardarPrenda(Prenda unaPrenda) {
    if (unaPrenda != null) {
      prendas.add(unaPrenda);
    } else {
      throw new RuntimeException("La prenda no puede ser nula");
    }

  }

  public void guardarUniforme(Uniforme unUniforme) {
    if (unUniforme != null) {
      uniformes.add(unUniforme);
    } else {
      throw new RuntimeException("El uniforme no puede ser nulo");
    }
  }

  ////////////////////////////////////////////////////

  public Uniforme sugerirPrimerUniforme() {
    return uniformes.get(0);
  }

  public Uniforme sugerirUltimoUniforme() {
    return uniformes.get(uniformes.size() - 1);
  }

  ////////////////////////////////////////////////////

  private Random rand = new Random();

  public Uniforme sugerirUniformeAleatorio() {
    return uniformes.get(rand.nextInt(uniformes.size()));
  }

  ////////////////////////////////////////////////////




}
