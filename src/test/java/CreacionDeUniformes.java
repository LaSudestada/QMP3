import org.junit.Assert;
import org.junit.Test;

public class CreacionDeUniformes {
  @Test
  public void crearUniforme() {
    Uniforme unUniforme = new Uniforme(
      unasZapatillas(), unPantalon(), unaCamisa()
    );
    Assert.assertNotNull(unUniforme);
  }

  @Test
  public void buildearUniformeEleganteSport() {
    Uniforme unUniforme = uniformeEleganteSport();
    Assert.assertNotNull(unUniforme);
  }

  @Test
  public void buildearUniformeInstitutoJohnson() {
    Uniforme unUniforme = uniformeInstitutoJohnson();
    Assert.assertNotNull(unUniforme);
  }




  /////////////////////////////////////////////////////////////

  private Uniforme uniformeEleganteSport() {
    UniformeBuilder unProtoUniforme = new UniformeBuilder();
    unProtoUniforme.setParteSuperior(unaCamisa());
    unProtoUniforme.setCalzado(unasZapatillas());
    unProtoUniforme.setParteInferior(unPantalon());
    return unProtoUniforme.buildUniforme();
  }

  private Prenda unasZapatillas() {
    Material LONA = new Material(null);
    PrendaBuilder unProtoCalzado = new PrendaBuilder(Tipo.ZAPATILLA);
    unProtoCalzado.setMaterial(LONA);
    unProtoCalzado.setColorPrincipal(new Color(255,255,255));
    return unProtoCalzado.buildPrenda();
  }

  private Prenda unPantalon() {
    PrendaBuilder unProtoPantalon = new PrendaBuilder(Tipo.PANTALON);
    unProtoPantalon.setMaterial(Material.JEAN);
    unProtoPantalon.setColorPrincipal(new Color(46,92,164));
    return unProtoPantalon.buildPrenda();
  }

  private Prenda unaCamisa() {
    PrendaBuilder unaProtoCamisa = new PrendaBuilder(Tipo.CHOMBA);
    unaProtoCamisa.setMaterial(Material.PIQUE_CUADRILLE);
    unaProtoCamisa.setColorPrincipal(new Color(186,49,59));
    unaProtoCamisa.setColorSecundario(new Color(31,24,40));
    return unaProtoCamisa.buildPrenda();
  }

  /////////////////////////////////////////////////////////////

  private Uniforme uniformeInstitutoJohnson() {
    UniformeBuilder unProtoUniforme = new UniformeBuilder();
    unProtoUniforme.setParteSuperior(unaCamisaBlanca());
    unProtoUniforme.setCalzado(unosZapatos());
    unProtoUniforme.setParteInferior(unPantalonDeVestir());
    return unProtoUniforme.buildUniforme();
  }

  private Prenda unosZapatos() {
    PrendaBuilder unProtoCalzado = new PrendaBuilder(Tipo.ZAPATO);
    unProtoCalzado.setMaterial(Material.CUERO);
    unProtoCalzado.setColorPrincipal(new Color(255,255,255));
    return unProtoCalzado.buildPrenda();
  }

  private Prenda unaCamisaBlanca() {
    PrendaBuilder unaProtoCamisa = new PrendaBuilder(Tipo.CAMISA_MANGA_CORTA);
    unaProtoCamisa.setMaterial(Material.ALGODON_LISO);
    unaProtoCamisa.setColorPrincipal(new Color(0,0,0));
    return unaProtoCamisa.buildPrenda();
  }

  private Prenda unPantalonDeVestir() {
    Material LANA = new Material(null);
    PrendaBuilder unProtoPantalon = new PrendaBuilder(Tipo.PANTALON);
    unProtoPantalon.setMaterial(LANA);
    unProtoPantalon.setColorPrincipal(new Color(255,255,255));
    return unProtoPantalon.buildPrenda();
  }



}
