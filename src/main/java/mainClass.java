import lib.Color.ColorCode;
import lib.Debug;
import lib.Forms;

public class mainClass {

  public static Forms forms;

  public static void main(String[] args) {
    if (forms == null) {
      Debug.Log(ColorCode.RED,"Error! YOu didn't specify a form type!");
    } else {
      Debug.Log("You chose: " + forms.toString());
    }
  }
}
