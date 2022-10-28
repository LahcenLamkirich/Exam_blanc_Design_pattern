package Graphes;

import java.util.ArrayList;
import java.util.List;

public class ListFigure extends Figure {

    List<Figure> listFigures = new ArrayList<>();

    public Figure AjouterFigure(Figure figure){
        listFigures.add(figure);
        return figure ;
    }

    @Override
    public double calculerSurface() {
        return 0;
    }

    @Override
    public double calculerPerimetre() {
        return 0;
    }

    @Override
    public void dessinerFigure() {
        for(Figure figure: listFigures){
            figure.dessinerFigure();
        }
    }
}
