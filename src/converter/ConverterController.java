package converter;

import java.util.Formatter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * UI controller for events and initializing components.
 * @author Thanaphon Keawjam
 */
public class ConverterController {
	@FXML
	TextField textfield1;
	@FXML
	TextField textfield2;
	@FXML
	private ComboBox<Length> combo1;
	@FXML
	private ComboBox<Length> combo2;
	
	/**
	 * avaFX calls the initialize() method of your controller when
	 * it creates the UI form, after the components have been created
	 * and @FXML annotated attributes have been set.
	 */
	@FXML
	public void initialize() {
	//	System.out.println("Running initialize");
		if(combo1 != null) {
			combo1.getItems().addAll(Length.values());
			combo1.getSelectionModel().select(0);
		}
		if(combo2 != null) {
			combo2.getItems().addAll(Length.values());
			combo2.getSelectionModel().select(1);
		}
	}
	
	/**
	 * Convert a distance from one unit to another.
	 * @param event is action event for convert.
	 */
	public void handleConvert(ActionEvent event) {
		String text1 = textfield1.getText().trim();
		String text2 = textfield2.getText().trim();
		Length unit1 = combo1.getValue();
		Length unit2 = combo2.getValue();
		Double calculate;
		Double parse;
		try {
			if(text2.isEmpty()) {
				parse = Double.parseDouble(text1);
				calculate = (parse * unit1.getValue()) / unit2.getValue();
				textfield2.setText(String.format("%.4g", calculate));
				return;
			}else if(text1.isEmpty()) {
				parse = Double.parseDouble(text2);
				calculate = (parse * unit2.getValue()) / unit1.getValue();
				textfield1.setText(String.format("%.4g", calculate));
				return;
			}
			//System.out.println("handleConvert converting " + text);
		}catch(NumberFormatException nfe) {
			if(text2.isEmpty()) {
				textfield2.setText("Can not convert");
			}else if(text1.isEmpty()) {
				textfield1.setText("Can not convert");
			}
		}
	}
	
	/**
	 * Clear text field.
	 */
	public void handleClear() {
		textfield1.clear();
		textfield2.clear();
	}
	
}
