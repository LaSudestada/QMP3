import com.google.common.collect.Sets;
import java.util.*;

public class Guardarropa {
  List<Uniforme> uniformes = new ArrayList<Uniforme>();
  List<Prenda> prendas = new ArrayList<>();


  ////////////////////////////////////////////////////

  private Set<Prenda> getCalzado() {
    return new HashSet<Prenda>(
        prendas.
        stream().
        filter(prenda -> prenda.getTipo().getCategoria() == Categoria.CALZADO).
        toList()
    );
  }

  private Set<Prenda> getParteInferior() {
    return new HashSet<Prenda>(
        prendas.
        stream().
        filter(prenda -> prenda.getTipo().getCategoria() == Categoria.PARTE_INFERIOR).
        toList()
    );
  }

  private Set<Prenda> getParteSuperior() {
    return new HashSet<Prenda>(
        prendas.
        stream().
        filter(prenda -> prenda.getTipo().getCategoria() == Categoria.PARTE_SUPERIOR).
        toList()
    );
  }

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

  public List<List<Prenda>> combinarPrendas() {
    Set<List<Prenda>> productoCartesiano = Sets.cartesianProduct(getParteSuperior(), getParteInferior(), getParteSuperior());
    return productoCartesiano.stream().toList();
  }

  ////////////////////////////////////////////////////

  private Random rand = new Random();

  public Uniforme sugerirUniformeAleatorio() {
    return uniformes.get(rand.nextInt(uniformes.size()));
  }

  ////////////////////////////////////////////////////




}
