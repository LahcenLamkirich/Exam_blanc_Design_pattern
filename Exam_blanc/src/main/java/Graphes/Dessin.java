package Graphes;

import java.util.ArrayList;
import java.util.List;

public class Dessin {
    List<Figure> figures = new ArrayList<>();

    public Figure ajouterFigure(Figure figure){
        figures.add(figure);
        return figure ;
    }

    public void removeFigure(Figure figure){
        figures.remove(figure);
    }

    public void dessiner(){
        for (Figure figure:figures){
            figure.dessinerFigure();
        }
    }
}
