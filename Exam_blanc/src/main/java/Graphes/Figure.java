package Graphes;

public abstract class Figure {
    int couleurContour ;
    int couleurRemplissage;
    int EpisseurContour;

    public abstract double calculerSurface();
    public abstract double calculerPerimetre();
    public abstract void dessinerFigure();

    public void setCouleurContour(int couleurContour) {
        this.couleurContour = couleurContour;
    }

    public void setCouleurRemplissage(int couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }

    public void setEpisseurContour(int episseurContour) {
        EpisseurContour = episseurContour;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "couleurContour=" + couleurContour +
                ", couleurRemplissage=" + couleurRemplissage +
                ", EpisseurContour=" + EpisseurContour +
                '}';
    }
}
