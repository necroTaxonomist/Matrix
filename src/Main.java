
public class Main
{
    public static void main(String[] args)
    {
        Line l = new Line(true);
        l.addPoint(1,2);
        l.addPoint(2,3);
        l.addPoint(3,4);

        System.out.println(Mat.disp(l.getMat()));
    }
}
