package blacklister_gui;

/**
 * Created by Brett Dixon & Dylan Chew on 4/8/2017.
 * ACIT 2515, Set 2B
 *
 * Brett D, A00997869
 * Dylan C, A00986529
 * Code from Bukcy Roberts : https://github.com/buckyroberts/Source-Code-from-Tutorials/blob/master/JavaFX/005_creatingAlertBoxes/AlertBox.java
 */


import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBox {

    public static void display(String title, String message) {
        Stage window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(400);

        Label label = new Label();
        label.setText(message);
        Button closeButton = new Button("Close this window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);

        //Display window and wait for it to be closed before returning
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }

}


