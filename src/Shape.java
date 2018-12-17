
public interface Shape
{
    public boolean isClosed();

    default int size()
    {
        return Mat.cols(getMat());
    }

    default int dims()
    {
        return Mat.rows(getMat()) - 1;
    }

    public double[][] getMat();
}
