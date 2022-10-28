package Graphes;

public class Rectangle extends Figure{

    Point point ;
    double largeur ;
    double hauteur ;


    public Rectangle(Point point, double largeur, double hauteur) {
        this.point = point;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public double calculerSurface() {
        return largeur*hauteur;
    }

    @Override
    public double calculerPerimetre() {
        return (largeur+hauteur)*2;
    }

    @Override
    public void dessinerFigure() {
        System.out.println("Rectangle("+point.getX()+","+point.getY()+","+largeur+
                ","+hauteur+","+super.toString()+")");
    }
}
