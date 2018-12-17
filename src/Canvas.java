
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Group;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Canvas extends Pane
{
    Cursor cursor;
    double width, height;

    public Canvas(double _width, double _height)
    {
        cursor = new Cursor(this);
        width = _width;
        height = _height;

        DebugPen dp = new DebugPen(this);
        cursor.addPen(dp);
    }

    public double canvasWidth()
    {
        return width;
    }

    public double canvasHeight()
    {
        return height;
    }

    public Dot addDot(double x, double y)
    {
        Dot d = new Dot(x,y);
        getChildren().add(d);
    }


    // Nested Classes
    public class Dot extends Group
    {
        double x;
        double y;

        Circle inner;
        Circle outer;
        Circle cbox;

        Dot(double _x, double _y)
        {
            x = _x;
            setLayoutX(x);

            y = _y;
            setLayoutY(y);

            inner = new Circle();
            inner.setFill(Color.RED);
            inner.setRadius(canvasHeight() / 200);

            outer = new Circle();
            outer.setFill(null);
            outer.setStroke(Color.RED);
            outer.setRadius(canvasHeight() / 100);

            cbox = new Circle();
            cbox.setRadius(canvasHeight() / 100);
            cbox.setOpacity(0);

            getChildren().addAll(inner, outer, cbox);
        }

        void select()
        {
            outer.setRadius(canvasHeight() / 50);
            cbox.setRadius(canvasHeight() / 50);
        }

        void deselect()
        {
            outer.setRadius(canvasHeight() / 100);
            cbox.setRadius(canvasHeight() / 100);
        }
    }
}
