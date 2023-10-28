import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ColorController implements ColorChangeObserver {

    @FXML
    private Button BtAmarillo;

    @FXML
    private Button BtAzul;

    @FXML
    private Button BtRojo;

    @FXML
    private VBox root_;

    @FXML
    private void botonAmarillo() {
        notifyColor("yellow");
    }

    @FXML
    private void botonAzul() {
        notifyColor("blue");
    }

    @FXML
    private void botonRojo() {
        notifyColor("red");
    }

    @Override
    public void notifyColor(String colorName) {
        root_.setStyle("-fx-background-color: " + colorName + ";");
    }
}
