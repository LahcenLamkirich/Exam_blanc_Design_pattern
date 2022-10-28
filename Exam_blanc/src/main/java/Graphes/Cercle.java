package Graphes;

public class Cercle extends Figure{

    Point point ;
    private double rayon;


    @Override
    public double calculerSurface() {
        return Math.PI*Math.pow(rayon,2);
    }

    @Override
    public double calculerPerimetre() {
        return 2*Math.PI*rayon;
    }

    @Override
    public void dessinerFigure() {
        System.out.println("This is a Cercle !!");
    }
}
