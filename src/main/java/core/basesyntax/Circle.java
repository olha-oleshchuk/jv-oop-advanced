package core.basesyntax;

public class Circle extends Figure {
    private static final double PI = 3.14;
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
        obtainTheArea();
    }

    public void obtainTheArea() {
        setArea(PI * radius * radius);
    }

    @Override
    public String draw() {
        return "Figure: Circle, area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor();
    }
}
