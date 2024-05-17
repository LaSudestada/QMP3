import java.util.List;

public class Color {
  private int red;
  private int green;
  private int blue;

  public Color(int red, int green, int blue) {
    if(esColorValido(red) && esColorValido(green) && esColorValido(blue)) {
      this.red = red;
      this.green = green;
      this.blue = blue;
    } else {
      throw new RuntimeException("Los colores seleccionados no son validos");
    }
  }

  private boolean esColorValido(int color) {
    return color >= 0 && color <= 255;
  }

  public int[] getColor() {
    return new int[]{red, green, blue};
  }
}
