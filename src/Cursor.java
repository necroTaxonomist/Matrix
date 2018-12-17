
import java.util.ArrayList;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.Node;

public class Cursor
{
    private ArrayList<Pen> pens;
    private EventHandler<MouseEvent> handler;

    public Cursor()
    {
        this(null);
    }
    public Cursor(Node parent)
    {
        pens = new ArrayList<Pen>();

        handler = new EventHandler<MouseEvent>()
        {
            @Override
            public void handle(MouseEvent e)
            {
                handleEvent(e);
            }
        };
        if (parent == null)
        {
            Main.mainScene.addEventFilter(MouseEvent.ANY, handler);
        }
        else
        {
            parent.addEventFilter(MouseEvent.ANY, handler);
        }
    }

    private void handleEvent(MouseEvent me)
    {
        for (Pen p : pens)
        {
            p.handle(me);
        }
    }

    public void addPen(Pen p)
    {
        pens.add(p);
    }

    public void clearPens()
    {
        pens.clear();
    }
}
