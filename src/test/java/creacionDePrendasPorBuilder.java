import org.junit.Assert;
import org.junit.Test;

public class creacionDePrendasPorBuilder {

  @Test
  public void creoUnaPrendaConBuilderTest(){
    PrendaBuilder unaProtoPrenda = new PrendaBuilder(Tipo.ZAPATO);
    unaProtoPrenda.setMaterial(Material.CUERO);
    unaProtoPrenda.setColorPrincipal(new Color(141,61,19));
    Prenda unaPrenda = unaProtoPrenda.buildPrenda();
    Assert.assertNotNull(unaPrenda);
  }

  @Test
  public void creoUnaPrendaSinNadaConBuilderTest(){

    Assert.assertThrows(RuntimeException.class, () -> {
      PrendaBuilder unaProtoPrenda = new PrendaBuilder(null);
    });
  }

  @Test
  public void creoUnaPrendaSinNadaSalvoElTipoConBuilderTest(){
    PrendaBuilder unaProtoPrenda = new PrendaBuilder(new Tipo(Categoria.PARTE_SUPERIOR));
    Assert.assertThrows(RuntimeException.class, unaProtoPrenda::buildPrenda);
  }

  @Test
  public void creoUnaPrendaSinMaterialConBuilderTest(){
    PrendaBuilder unaProtoPrenda = new PrendaBuilder(new Tipo(Categoria.PARTE_SUPERIOR));
    unaProtoPrenda.setColorPrincipal(new Color(0,0,0));
    Assert.assertThrows(RuntimeException.class, unaProtoPrenda::buildPrenda);
  }

  @Test
  public void creoUnaPrendaSinColorPrincipalConBuilderTest(){
    PrendaBuilder unaProtoPrenda = new PrendaBuilder(new Tipo(Categoria.PARTE_SUPERIOR));
    unaProtoPrenda.setMaterial(Material.PIQUE_LISO);
    Assert.assertThrows(RuntimeException.class, unaProtoPrenda::buildPrenda);
  }


}
