import org.junit.Assert;
import org.junit.Test;

public class CreacionDePrendas {
  @Test
  public void crearPrendaSimpleTest() {
    Prenda unaPrenda = new Prenda(Tipo.REMERA, Material.ALGODON_RAYADO, new Color(0,0,0), new Color(255,255,255));
    Assert.assertEquals(Tipo.REMERA, unaPrenda.tipo);
  }

  @Test
  public void crearPrendaSinTramaTest() {
    Prenda unaPrenda = new Prenda(Tipo.REMERA, new Material(null), new Color(0,0,0), new Color(255,255,255));
    Assert.assertEquals(Trama.LISA, unaPrenda.material.getTrama());
  }

  @Test
  public void crearPrendaSinColorSecundarioTest() {
    Prenda unaPrenda = new Prenda(Tipo.PANTALON, Material.JEAN, new Color(0,0,255), null);
    Assert.assertNull(unaPrenda.colorSecundario);
  }

  //Este test deberìa fallar, pero no falla
  @Test
  public void crearPrendaSinTipo() {
    Prenda unaPrenda = new Prenda(null, Material.JEAN, new Color(0,0,255), null);
    Assert.assertNull(unaPrenda.getTipo());
  }


}
