
import java.util.ArrayList;

public class Line extends ArrayList<double[][]> implements Shape
{
    private boolean closed;

    public Line()
    {
        this(false);
    }
    public Line(boolean _closed)
    {
        super();
        closed = _closed;
    }

    public void addPoint(double ... x)
    {
        double[][] m = Mat.getCol(x);
        m = Mat.vConcat(m, Mat.ones(1));
        add(m);
    }

    public boolean isClosed()
    {
        return closed;
    }

    public double[][] getMat()
    {
        double[][][] type = new double[1][1][1];

        double[][] mat = Mat.hConcat(toArray(type));

        if (closed)
        {
            mat = Mat.hConcat(mat, get(0));
        }

        return mat;
    }
}
