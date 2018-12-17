
public interface Shape
{
    public double[][] get(int index) throws IndexOutOfBoundsException;
    public int size();

    public boolean isClosed();

    public double[][] getMat();
}
