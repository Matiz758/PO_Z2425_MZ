public class Main {
    public static void main(String[] args) {
        Point point_1 = new Point();
        Point point_2 = new Point();
        Circle point_3 = new Circle();
        Circle srednica = new Circle();

        point_1.x = 9;
        point_1.y = -2;
        point_2.x = 8;
        point_2.y = -3;
        point_3.x = 5;
        point_3.y = -4;
        srednica.d = 8;

        Calculator calc = new Calculator();
        Circle circ = new Circle();

        System.out.println("Odległość między punktem (" + point_1.x + ", " + point_1.y + ") a (" + point_2.x + ", " + point_2.y + ") wynosi: " + Math.sqrt(+ calc.distance(point_1, point_2)));
        System.out.println("Pole koła o średnicy " + srednica.d + " i punkcie o środku (" + point_3.x + ", " + point_3.y + "), wynsoi: " + circ.area(srednica) + " a jego obwód wynosi: " + circ.circumference(srednica));
    }
}

class Point
{
    int x;
    int y;
}

class Calculator
{
    double distanceX(Point a, Point b)
    {
        return Math.sqrt((a.x - b.x) * (a.x - b.x));
    }
    double distanceY(Point a, Point b)
    {
        return Math.sqrt((a.y - b.y) * (a.y - b.y));
    }
    double distance(Point a, Point b)
    {
        return Math.sqrt(distanceX(a, b) * distanceX(a, b) + (distanceY(a, b) * distanceY(a, b)));
    }
}

class Circle
{
    int x;
    int y;
    int d;

    double area(Circle a)
    {
        return 3.14 * a.d * a.d / 4;
    }
    double circumference(Circle a)
    {
        return 3.14 * a.d;
    }
}
