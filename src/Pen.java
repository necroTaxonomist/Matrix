
import javafx.scene.input.MouseEvent;

public abstract class Pen
{
    public void handle(MouseEvent me)
    {
        if (me.getEventType().equals(MouseEvent.MOUSE_DRAGGED))
            drag(me);
        else if (me.getEventType().equals(MouseEvent.MOUSE_CLICKED))
            click(me);
        else if (me.getEventType().equals(MouseEvent.MOUSE_MOVED))
            move(me);
        else if (me.getEventType().equals(MouseEvent.MOUSE_PRESSED))
            press(me);
        else if (me.getEventType().equals(MouseEvent.MOUSE_RELEASED))
            release(me);
    }

    public void drag(MouseEvent me)
    {
    }

    public void click(MouseEvent me)
    {
    }

    public void move(MouseEvent me)
    {
    }

    public void press(MouseEvent me)
    {
    }

    public void release(MouseEvent me)
    {
    }
}
