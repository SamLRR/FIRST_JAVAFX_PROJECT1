import DAO.DBUtil;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class main /*extends Application */{



    public void start(Stage primaryStage) throws Exception {
        Stage stage = new Stage();
        Group root  = new Group();
        Scene scene = new Scene(root,300,300);
        stage.setScene(scene);
        stage.showAndWait();

    }

    public static void main(String[] args) throws Exception {
        DBUtil.dbConnect();
        //launch(args);

    }
}
