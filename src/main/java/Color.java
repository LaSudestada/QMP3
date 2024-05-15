import java.util.List;

public class Color {
  private int red;
  private int green;
  private int blue;

  public Color(int red, int green, int blue) {
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  public int[] getColor() {
    return new int[]{red, green, blue};
  }
}
