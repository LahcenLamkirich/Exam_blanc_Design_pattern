package Design_Pattern.Strategy_pattern;

import Graphes.Figure;

import java.util.List;

public class TraiterImp1 implements ITraiter {

    @Override
    public void traiter(List<Figure> figures) {
        System.out.println("The first Traitement !!");
        for (Figure figure: figures){
            figure.setCouleurContour(10);
            figure.setCouleurRemplissage(20);
            figure.setEpisseurContour(30);
            figure.dessinerFigure();
        }
    }
}
