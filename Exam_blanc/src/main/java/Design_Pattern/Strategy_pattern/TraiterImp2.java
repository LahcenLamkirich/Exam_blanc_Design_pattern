package Design_Pattern.Strategy_pattern;

import Graphes.Figure;

import java.util.List;

public class TraiterImp2 implements ITraiter{
    @Override
    public void traiter(List<Figure> figures) {
        System.out.println("The second Traitement !!");
        for(Figure figure: figures){
            figure.setEpisseurContour(5);
            figure.setCouleurRemplissage(10);
            figure.setCouleurContour(15);

            figure.dessinerFigure();
        }
    }
}
