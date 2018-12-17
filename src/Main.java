import javafx.application.Application;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class Main extends Application
{
    public static Stage mainStage;
    public static Scene mainScene;
    public static Pane mainPane;

    public static final int WINDOW_WIDTH = 800;
    public static final int WINDOW_HEIGHT = 640;

    private static Main mainApp;

    public static void main(String[] args)
    {
        launch(args);
    }

    public void start(Stage primaryStage)
    {
        // set main object
        mainApp = this;

        // set main stage
        mainStage = primaryStage;

        // set main pane
        BorderPane bp = new BorderPane();
        setPane(bp);

        Canvas c = new Canvas(WINDOW_HEIGHT, WINDOW_HEIGHT);
        bp.setCenter(c);

        // show
        mainStage.show();
    }

    private void setPane(Pane pane)
    {
        mainPane = pane;
        mainScene = new Scene(mainPane, WINDOW_WIDTH, WINDOW_HEIGHT);
        mainStage.setScene(mainScene);
    }

    public static double width(double factor)
    {
        return WINDOW_WIDTH * factor;
    }

    public static double height(double factor)
    {
        return WINDOW_HEIGHT * factor;
    }
}
