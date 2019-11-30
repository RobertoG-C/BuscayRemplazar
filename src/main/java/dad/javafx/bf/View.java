package dad.javafx.bf;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class View extends GridPane {

	private Label buscaLabel, remplazaLabel;
	private TextField buscaField, remplazaField;
	private CheckBox mayusMinCheck, atrasCheck, regularCheck, resaltaCheck;
	private Button buscaButton, remplazaButton, remplazaAllButton, cerrarButton, ayudaButton;

	private GridPane checkGrid;
	private VBox opcionVbox;

	public View() {

		buscaLabel = new Label("Buscar:");
		buscaField = new TextField();

		remplazaLabel = new Label("Remplazar con:");
		remplazaField = new TextField();


		mayusMinCheck = new CheckBox("Mayúsculas y Minúsculas");
		atrasCheck = new CheckBox("Buscar hacia atrás");
		regularCheck = new CheckBox("Expreción Regular");
		resaltaCheck = new CheckBox("Resaltar Resultados");

		checkGrid = new GridPane();
		checkGrid.addRow(0, mayusMinCheck, atrasCheck);
		checkGrid.addRow(1, regularCheck, resaltaCheck);
		checkGrid.setHgap(5);
		checkGrid.setVgap(5);
		checkGrid.setAlignment(Pos.BASELINE_CENTER);
		
		buscaButton = new Button("Buscar");
		buscaButton.setMaxWidth(Double.MAX_VALUE);
		
		remplazaButton = new Button("Remplazar");
		remplazaButton.setMaxWidth(Double.MAX_VALUE);
		
		remplazaAllButton = new Button("Remplazar todo");
		remplazaAllButton.setMaxWidth(Double.MAX_VALUE);
		
		cerrarButton = new Button("Cerrar");
		cerrarButton.setMaxWidth(Double.MAX_VALUE);
		
		ayudaButton = new Button("Ayuda");
		ayudaButton.setMaxWidth(Double.MAX_VALUE);

		opcionVbox = new VBox(5, buscaButton, remplazaButton, remplazaAllButton, cerrarButton, ayudaButton);

		
		this.addRow(0, buscaLabel, buscaField, opcionVbox);
		this.addRow(1, remplazaLabel, remplazaField);
		this.add(checkGrid, 1, 2);
		GridPane.setRowSpan(opcionVbox, 3);
		this.setPadding(new Insets(5));
		this.setVgap(5);
		this.setHgap(5);
		
		ColumnConstraints [] cols= {
				 new ColumnConstraints(),
				 new ColumnConstraints(),
		};
			
			cols[1].setHgrow(Priority.ALWAYS);
			this.getColumnConstraints().setAll(cols);			
	}
}
