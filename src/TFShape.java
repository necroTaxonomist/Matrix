
import java.util.LinkedList;

public class TFShape implements Shape
{
    Shape shape;
    int d;
    LinkedList<double[][]> tf;

    public TFShape(Shape _shape)
    {
        shape = _shape;
        d = shape.dims() + 1;
        tf = new LinkedList<double[][]>();
    }

    public Shape getShape()
    {
        return shape;
    }

    public void pushTF(double[][] m)
    {
        tf.addLast(m);
    }

    public double[][] popTF()
    {
        return tf.removeLast();
    }

    public double[][] setTF(int index, double[][] m)
    {
        double[][] prev = tf.get(index);
        tf.set(index, m);
        return prev;
    }

    public double[][] multTF(int index, double[][] m)
    {
        double[][] prev = tf.get(index);
        tf.set(index, Mat.mult(m, prev));
        return prev;
    }

    public int size()
    {
        return shape.size();
    }

    public boolean isClosed()
    {
        return shape.isClosed();
    }

    public double[][] getMat()
    {
        double[][] ret = shape.getMat();

        for (double[][] m : tf)
        {
            ret = Mat.mult(m, ret);
        }

        return ret;
    }
}
