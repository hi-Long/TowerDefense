package Enemy;

public enum Direction {
    LEFT(Math.PI / 2), RIGHT(- Math.PI / 2), UP(Math.PI), DOWN(0);
    double degree;
    Direction(double degree) {
        this.degree = degree;
    }
    public double getDegree() {
        return degree;
    }
}
