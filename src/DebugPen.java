
import javafx.scene.input.MouseEvent;

public class DebugPen extends Pen
{
    public void press(MouseEvent me)
    {
        System.out.println("Press at " + me.getX() + ", " + me.getY());
    }
}
