import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.Color;

public aspect AspectoColor {
	pointcut PointcutObserver(Color color) : call(void notifyColor(Color)) && args(color);
	//Advice para los botones observados.
	after(Color color) returning : PointcutObserver(color) {
		
	}
	
}