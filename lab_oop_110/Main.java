import MVC.Controler;
import MVC.Model;
import MVC.View;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        View view = new View();
        Model model = new Model();
        Controler controler = new Controler(model, view);

        controler.simulation();
        controler.updateView();

    }
}
