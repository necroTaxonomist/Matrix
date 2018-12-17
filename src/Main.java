
public class Main
{
    public static void main(String[] args)
    {
        Line l = new Line(true);
        l.addPoint(1,2);
        l.addPoint(2,3);
        l.addPoint(3,4);

        TFShape sh = new TFShape(l);
        System.out.println(Mat.disp(sh.getMat()));

        sh.pushTF(Mat.scaleTF(2,2));
        System.out.println(Mat.disp(sh.getMat()));

        sh.pushTF(Mat.tlTF(1,1));
        System.out.println(Mat.disp(sh.getMat()));

        sh.multTF(0, Mat.scaleTF(.5,.5));
        System.out.println(Mat.disp(sh.getMat()));
    }
}
