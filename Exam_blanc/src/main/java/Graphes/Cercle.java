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
        return 0;
    }

    @Override
    public void dessinerFigure() {

    }
}
