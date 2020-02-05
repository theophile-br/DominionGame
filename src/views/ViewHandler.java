package views;

import controllers.ControllerJeu;
import controllers.ControllerMenuPrincipal;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class ViewHandler extends Application {
    private Scene scene;
    private Group root;
    private ViewMenuPrincipal viewMenuPrincipal;
    private ViewJeu viewJeu;
    private ControllerMenuPrincipal controllerMenuPrincipal;
    private ControllerJeu controllerJeu;

    @Override
    public void start(Stage primaryStage) throws Exception{
        root = new Group();
        scene = new Scene(root, 500, 500);

        /** ON EDITE LA SCENE */
        primaryStage.setTitle("Dominion");
        //primaryStage.setFullScreenExitHint("");
        //primaryStage.setFullScreen(true);
        //primaryStage.setFullScreenExitKeyCombination(KeyCombination.NO_MATCH);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        //primaryStage.setScene(scene);
        //primaryStage.setResizable(false);
        primaryStage.show();
    }

    public void afficherMenuPrincipale(){
        viewMenuPrincipal = new ViewMenuPrincipal(root);
        viewMenuPrincipal.clearAndInitRoot();
        controllerMenuPrincipal = new ControllerMenuPrincipal(this);
    }

    public void afficherJeu(){
        viewJeu = new ViewJeu(root);
        viewJeu.clearAndInitRoot();
        controllerJeu = new ControllerJeu(this);
    }

    public ViewMenuPrincipal getViewMenuPrincipal(){
        return viewMenuPrincipal;
    }

    public ViewJeu getViewJeu(){
        return viewJeu;
    }
}