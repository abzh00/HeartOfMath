package sample;

import javafx.embed.swing.SwingFXUtils;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.TextField;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.*;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.event.ActionEvent;
import javafx.stage.FileChooser;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {
    @FXML
    private ColorPicker bgcolor, lcolor, pcolor;

    @FXML
    private TextField npTF, NTF, rTF;

    @FXML
    private AnchorPane pane;

    @FXML
    void changecolor1(ActionEvent event) {
        pane.getChildren().clear();
        Color selectedColor = bgcolor.getValue();
        pane.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectedColor.toString()), CornerRadii.EMPTY, Insets.EMPTY)));
        Color lColor = lcolor.getValue();
        Color pColor = pcolor.getValue();
        double width = 600, height = 600;
        double n  = Double.parseDouble(npTF.getText());
        double radius  = Double.parseDouble(rTF.getText());
        double N  = Double.parseDouble(NTF.getText());
        double k = 360/n;

        Circle circle = new Circle();
        circle.setCenterX(width/2);
        circle.setCenterY(height/2);
        circle.setRadius(radius);
        circle.setFill(Color.TRANSPARENT);


        for (int i = 0; i<n; i++){
            double x = width/2 + radius*Math.cos(Math.toRadians(i*k));
            double y = height/2 + radius*Math.sin(Math.toRadians(i*k));
            double x1 = width/2 + radius*Math.cos(Math.toRadians(((i*N)%n)*k));
            double y1 = height/2 + radius*Math.sin(Math.toRadians(((i*N)%n)*k));
            Line line = new Line(x, y, x1, y1);
            line.setStroke(lColor);
            Circle cir = new Circle(x, y, 1);
            cir.setFill(pColor);
            pane.getChildren().addAll(line, cir);
        }

        pane.getChildren().add(circle);
    }

    @FXML
    void changecolor2(ActionEvent event) {
        pane.getChildren().clear();
        Color lColor = lcolor.getValue();
        Color pColor = pcolor.getValue();
        double width = 600, height = 600;
        double n  = Double.parseDouble(npTF.getText());
        double radius  = Double.parseDouble(rTF.getText());
        double N  = Double.parseDouble(NTF.getText());
        double k = 360/n;

        Circle circle = new Circle();
        circle.setCenterX(width/2);
        circle.setCenterY(height/2);
        circle.setRadius(radius);
        circle.setFill(Color.TRANSPARENT);


        for (int i = 0; i<n; i++){
            double x = width/2 + radius*Math.cos(Math.toRadians(i*k));
            double y = height/2 + radius*Math.sin(Math.toRadians(i*k));
            double x1 = width/2 + radius*Math.cos(Math.toRadians(((i*N)%n)*k));
            double y1 = height/2 + radius*Math.sin(Math.toRadians(((i*N)%n)*k));
            Line line = new Line(x, y, x1, y1);
            line.setStroke(lColor);
            Circle cir = new Circle(x, y, 1);
            cir.setFill(pColor);
            pane.getChildren().addAll(line, cir);
        }

        pane.getChildren().add(circle);
    }

    @FXML
    void changecolor3(ActionEvent event) {
        pane.getChildren().clear();
        Color lColor = lcolor.getValue();
        Color pColor = pcolor.getValue();
        double width = 600, height = 600;
        double n  = Double.parseDouble(npTF.getText());
        double radius  = Double.parseDouble(rTF.getText());
        double N  = Double.parseDouble(NTF.getText());
        double k = 360/n;

        Circle circle = new Circle();
        circle.setCenterX(width/2);
        circle.setCenterY(height/2);
        circle.setRadius(radius);
        circle.setFill(Color.TRANSPARENT);


        for (int i = 0; i<n; i++){
            double x = width/2 + radius*Math.cos(Math.toRadians(i*k));
            double y = height/2 + radius*Math.sin(Math.toRadians(i*k));
            double x1 = width/2 + radius*Math.cos(Math.toRadians(((i*N)%n)*k));
            double y1 = height/2 + radius*Math.sin(Math.toRadians(((i*N)%n)*k));
            Line line = new Line(x, y, x1, y1);
            line.setStroke(lColor);
            Circle cir = new Circle(x, y, 1);
            cir.setFill(pColor);
            pane.getChildren().addAll(line, cir);
        }

        pane.getChildren().add(circle);
    }

    @FXML
    public void runButtonPressed(ActionEvent event) throws IOException {
        pane.getChildren().clear();
        Color lColor = lcolor.getValue();
        Color pColor = pcolor.getValue();
        double width = 600, height = 600;
        double n  = Double.parseDouble(npTF.getText());
        double radius  = Double.parseDouble(rTF.getText());
        double N  = Double.parseDouble(NTF.getText());
        double k = 360/n;

        Circle circle = new Circle();
        circle.setCenterX(width/2);
        circle.setCenterY(height/2);
        circle.setRadius(radius);
        circle.setFill(Color.TRANSPARENT);


        for (int i = 0; i<n; i++){
            double x = width/2 + radius*Math.cos(Math.toRadians(i*k));
            double y = height/2 + radius*Math.sin(Math.toRadians(i*k));
            double x1 = width/2 + radius*Math.cos(Math.toRadians(((i*N)%n)*k));
            double y1 = height/2 + radius*Math.sin(Math.toRadians(((i*N)%n)*k));
            Line line = new Line(x, y, x1, y1);
            line.setStroke(lColor);
            Circle cir = new Circle(x, y, 1);
            cir.setFill(pColor);
            pane.getChildren().addAll(line, cir);
        }

        pane.getChildren().add(circle);

    }

    FileChooser fileChooser = new FileChooser();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fileChooser.setInitialDirectory(new File("C:\\"));
    }

    public void saveButtonPressed(ActionEvent event) throws IOException {
        WritableImage image = pane.snapshot(new SnapshotParameters(), null);

        fileChooser.setTitle("Save Image File");
        fileChooser.setInitialFileName("myCircle");
        fileChooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("PNG Files", "*.png"), new FileChooser.ExtensionFilter("GIF Files", "*.gif"), new FileChooser.ExtensionFilter("JPEG Files", "*.jpeg"), new FileChooser.ExtensionFilter("BMP Files", "*.bmp"));

        File file = fileChooser.showSaveDialog(null);

        ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", file);
    }
}