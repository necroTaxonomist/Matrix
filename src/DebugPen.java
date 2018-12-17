
import javafx.scene.input.MouseEvent;

public class DebugPen extends Pen
{
    Canvas canvas;

    public DebugPen(Canvas _canvas)
    {
        canvas = _canvas;
    }

    public void press(MouseEvent me)
    {
        canvas.addDot(me.getX(), me.getY());
    }
}
