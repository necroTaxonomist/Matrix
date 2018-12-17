
public abstract class Mat
{
    static int rows(double[][] m)
    {
        return m.length;
    }

    static int cols(double[][] m)
    {
        return m[0].length;
    }

    static double[][] getRow(double[][] m, int r)
    {
        double[][] ret = new double[1][cols(m)];

        for (int c = 0; c < cols(m); ++c)
        {
            ret[0][c] = m[r][c];
        }

        return ret;
    }

    static double[][] getCol(double[][] m, int c)
    {
        double[][] ret = new double[rows(m)][1];

        for (int r = 0; r < rows(m); ++r)
        {
            ret[r][0] = m[r][c];
        }

        return ret;
    }

    static double[][] colVec(double ... v)
    {
        double[][] m = new double[v.length][1];

        for (int r = 0; r < v.length; ++r)
        {
            m[r][0] = v[r];
        }

        return m;
    }

    static double[][] zeros(int size)
    {
        return zeros(size, size);
    }
    static double[][] zeros(int rows, int cols)
    {
        double[][] m = new double[rows][cols];

        for (int r = 0; r < rows; ++r)
        {
            for (int c = 0; c < cols; ++c)
            {
                m[r][c] = 0;
            }
        }

        return m;
    }

    static double[][] ident(int size)
    {
        return ident(size, size);
    }
    static double[][] ident(int rows, int cols)
    {
        double[][] m = zeros(rows, cols);

        for (int i = 0; i < rows && i < cols; ++i)
        {
            m[i][i] = 1;
        }

        return m;
    }

    static double[][] mult(double[][] m1, double[][] m2)
    {
        if (cols(m1) != rows(m2))
            throw new ArithmeticException("Invalid matrix multiplication");

        double[][] m = new double[rows(m1)][cols(m2)];

        for (int r = 0; r < rows(m); ++r)
        {
            for (int c = 0; c < cols(m); ++c)
            {
                for (int x = 0; x < cols(m1); ++x)
                {
                    m[r][c] = m1[r][x] * m2[x][c];
                }
            }
        }

        return m;
    }

    static double[][] tp(double[][] m)
    {
        double [][] ret = new double[cols(m)][rows(m)];

        for (int r = 0; r < rows(m); ++r)
        {
            for (int c = 0; c < cols(m); ++c)
            {
                ret[c][r] = m[r][c];
            }
        }

        return ret;
    }

    static String disp(double[][] m)
    {
        String str = "";

        if (cols(m) == 1)
        {
            str += "(";

            for (int r = 0; r < rows(m); ++r)
            {
                if (r != 0)
                    str += ", ";
                str += m[r][0];
            }

            str += ")";
        }
        else
        {
            for (int r = 0; r < rows(m); ++r)
            {
                if (r == 0)
                    str += "[";
                else
                    str += "\n ";

                for (int c = 0; c < cols(m); ++c)
                {
                    if (c != 0)
                        str += " ";
                    str += m[r][c];
                }
            }

            str += "]";
        }

        return str;
    }
}
