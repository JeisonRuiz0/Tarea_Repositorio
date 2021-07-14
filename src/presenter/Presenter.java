package presenter;

import model.MainModel;
import view.MainWindow;

public class Presenter {

    private MainModel model;
    private MainWindow window;

    public Presenter(){
        model = new MainModel();
        window = new MainWindow();
    }
}
