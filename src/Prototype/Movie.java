package Prototype;

public class Movie extends Item{
    private double runtime;

    public double getRuntime() {
        return runtime;
    }

    public void setRuntime(double runtime) {
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "runtime=" + runtime +
                "} " + super.toString();
    }
}
