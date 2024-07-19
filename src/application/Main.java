package application;
	
import java.util.List;

import Models.ConstructorMaxPoint;
import Repositories.QueryRepositories;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	private TableView<ConstructorMaxPoint> table;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("TOP 10 Mejores Puntajes de Constructores");

        // Crear la tabla y las columnas
        table = new TableView<>();
        TableColumn<ConstructorMaxPoint, String> nameColumn = new TableColumn<>("Constructor Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("ConstructorName"));

        TableColumn<ConstructorMaxPoint, Float> pointsColumn = new TableColumn<>("Total Points");
        pointsColumn.setCellValueFactory(new PropertyValueFactory<>("points"));

        table.getColumns().addAll(nameColumn, pointsColumn);

        // Obtener datos y agregarlos a la tabla
        QueryRepositories queryRepositories = new QueryRepositories();
        List<ConstructorMaxPoint> drivers = queryRepositories.getConstructorsMaxPoints();
        ObservableList<ConstructorMaxPoint> data = FXCollections.observableArrayList(drivers);
        table.setItems(data);

        VBox vbox = new VBox(table);
        Scene scene = new Scene(vbox, 400, 290); // Ajustar el ancho y alto de la escena


        primaryStage.setScene(scene);
        primaryStage.show();
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
