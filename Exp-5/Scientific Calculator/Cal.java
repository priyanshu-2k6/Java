import java.util.Scanner;

abstract class Calculator {
    public static double err = 99999999999.0;

    abstract double add(double x, double y);

    abstract double subtract(double x, double y);

    abstract double multiply(double x, double y);

    abstract double divide(double x, double y);

}

class ScientificCalculator extends Calculator {
    @Override
    double add(double a, double b) {
        return a + b;
    }

    @Override
    double subtract(double a, double b) {
        return a - b;
    }

    @Override
    double multiply(double a, double b) {
        return a * b;
    }

    @Override
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Denominator can't be zero...");
            return err;
        } else {
            return a / b;
        }
    }

    double power(double a, double b) {
        double c = a;
        for (int i = 1; i < b; i++) {
            c *= a;
        }
        return c;
    }

    double log(double a, double b) {
        if (b <= 1) {
            System.out.println("Base can't be less than or equal to 1...");
            return err;
        } else {
            return Math.log(a) / Math.log(b);
        }
    }

    double sin(double a) {
        return Math.sin(a);
    }

    double cos(double a) {
        return Math.cos(a);
    }

    double tan(double a) {
        return Math.tan(a);
    }

    double asin(double a) {
        return Math.asin(a);
    }

    double acos(double a) {
        return Math.acos(a);
    }

    double atan(double a) {
        return Math.atan(a);
    }
}

class MatrixCalculator extends Calculator {
    @Override
    double add(double a, double b) {
        return a + b;
    }

    @Override
    double subtract(double a, double b) {
        return a - b;
    }

    @Override
    double multiply(double a, double b) {
        return a * b;
    }

    @Override
    double divide(double a, double b) {
        if (b == 0) {
            return err;
        } else {
            return a / b;
        }
    }

    void matrixAdd(double[][] a, double[][] b) {
        int m = a.length;
        int n = (m > 0) ? a[0].length : 0;
        double[][] res = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = add(a[i][j], b[i][j]);
            }
        }
        System.out.println("Addition of the given matrices: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    void matrixSub(double[][] a, double[][] b) {
        int m = a.length;
        int n = (m > 0) ? a[0].length : 0;
        double[][] res = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = subtract(a[i][j], b[i][j]);
            }
        }
        System.out.println("Subtraction of the given matrices: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    void matrixMul(double[][] a, double[][] b) {
        int m = a.length;       // rows of a
        int p = a[0].length;    // columns of a
        int n = b[0].length;    // columns of b
        double[][] res = new double[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < p; k++) {
                    res[i][j] += multiply(a[i][k], b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of given matrices:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Cal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Scientific / Matrix Calculator");
        System.out.print("1. Scientific Calculations\n2. Matrix Calculations\nEnter choice:");
        int a = s.nextInt();
        if (a == 1) {
            int b, c;
            double d, e;
            ScientificCalculator sci = new ScientificCalculator();
            System.out.println();
            System.out.print(
                    "1. Addition\n2. Subtraction\n3. Division\n4. Multiplication\n5. Exponential\n6. Logarithmic\n7. Trigonometric\nEnter choice:");
            b = s.nextInt();
            switch (b) {
                case 1, 2, 3, 4, 5, 6:
                    System.out.println("Enter two numbers:");
                    d = s.nextDouble();
                    e = s.nextDouble();
                    switch (b) {
                        case 1:
                            System.out.println("Result = " + sci.add(d, e));
                            break;
                        case 2:
                            System.out.println("Result = " + sci.subtract(d, e));
                            break;
                        case 3:
                            if (sci.divide(d, e) == Calculator.err) {
                                break;
                            }
                            System.out.println("Result = " + sci.divide(d, e));
                            break;
                        case 4:
                            System.out.println("Result = " + sci.multiply(d, e));
                            break;
                        case 5:
                            System.out.println("Result = " + sci.power(d, e));
                            break;
                        case 6:
                            if (sci.log(d, e) == Calculator.err) {
                                break;
                            }
                            System.out.println("Result = " + sci.log(d, e));
                            break;
                    }
                    break;
                case 7:
                    System.out.println();
                    System.out.print("1. Sin\n2. Cos\n3. Tan\n4. Sin^-1\n5. Cos^-1\n6. Tan^-1\nEnter choice:");
                    c = s.nextInt();
                    if (c < 1 || c > 6) {
                        System.out.println("Enter a valid choice...");
                        break;
                    }
                    System.out.print("Enter angle in radians: ");
                    d = s.nextDouble();
                    switch (c) {
                        case 1:
                            System.out.println("Sin(" + d + ") = " + sci.sin(d));
                            break;

                        case 2:
                            System.out.println("Cos(" + d + ") = " + sci.cos(d));
                            break;

                        case 3:
                            System.out.println("Tan(" + d + ") = " + sci.tan(d));
                            break;

                        case 4:
                            System.out.println("Sin^-1(" + d + ") = " + sci.asin(d));
                            break;

                        case 5:
                            System.out.println("Cos^-1(" + d + ") = " + sci.acos(d));
                            break;

                        case 6:
                            System.out.println("Tan^-1(" + d + ") = " + sci.atan(d));
                            break;

                        default:
                            System.out.println("Enter a valid choice!");
                            break;
                    }
                    break;

                default:
                    System.out.println("Enter a valid choice...");
                    break;
            }
        } else if (a == 2) {
            MatrixCalculator m = new MatrixCalculator();
            System.out.println();
            System.out.println("1. Matrix addition\n2. Matrix subtraction\n3. Matrix multiplication\nEnter choice:");
            int c = s.nextInt();
            switch (c) {
                case 1, 2:
                    System.out.println("Enter number of rows and columns:");
                    int j = s.nextInt();
                    int k = s.nextInt();
                    System.out.println("Enter the two matrices below\nMatrix 1:");
                    double[][] m1 = new double[j][k];
                    double[][] m2 = new double[j][k];
                    for (int g = 0; g < j; g++) {
                        for (int h = 0; h < k; k++) {
                            m1[j][k] = s.nextDouble();
                        }
                    }
                    System.out.println("\nMatrix 2:");
                    for (int g = 0; g < j; g++) {
                        for (int h = 0; h < k; k++) {
                            m2[j][k] = s.nextDouble();
                        }
                    }
                    switch (c) {
                        case 1:
                            m.matrixAdd(m1, m2);
                            break;
                        case 2:
                            m.matrixSub(m1, m2);
                            break;
                    }
                    break;

                case 3:
                    System.out.println("Enter rows and columns of 1st matrix:");
                    int r1 = s.nextInt();
                    int c1 = s.nextInt();
                    System.out.print("Enter only column of 2nd matrix: ");
                    int c2 = s.nextInt();
                    System.out.println("Enter the matrices:\nMatrix 1:");
                    double[][] m3 = new double[r1][c1];
                    double[][] m4 = new double[c1][c2];
                    for (int i = 0; i < r1; i++) {
                        for (int l = 0; l < c1; l++) {
                            m3[r1][c1] = s.nextDouble();
                        }
                    }
                    System.out.println("Matrix 2:");
                    for (int i = 0; i < c1; i++) {
                        for (int l = 0; l < c2; l++) {
                            m4[c1][c2] = s.nextDouble();
                        }
                    }
                    m.matrixMul(m3, m4);
                    break;
            }

        }
        s.close();
    }
}