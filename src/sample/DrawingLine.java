package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;


public class DrawingLine extends Application{
    @Override
    public void start(Stage stage) {
        double radius = 300;
        double width = 1366, height = 768;

        Circle circle = new Circle();
        circle.setCenterX(width/2);
        circle.setCenterY(height/2);
        circle.setRadius(radius);
        circle.setFill(Color.TRANSPARENT);
        circle.setStroke(Color.BLACK);
        Line linex = new Line(width/2-radius, height/2, width/2+radius, height/2);
        Line liney = new Line(width/2, height/2-radius, width/2, height/2+radius);

        Group root = new Group(circle);

        double n = 200;
        int h = 73;
        double k = 360/n;
        for (int i = 0; i<n*3; i++){
            double x = width/2 + radius*Math.cos(Math.toRadians(i*k));
            double y = height/2 + radius*Math.sin(Math.toRadians(i*k));
            double x1 = width/2 + radius*Math.cos(Math.toRadians(((i*h)%n)*k));
            double y1 = height/2 + radius*Math.sin(Math.toRadians(((i*h)%n)*k));
            Line line = new Line(x, y, x1, y1);
            line.setStroke(Color.GREEN);
            Circle cir = new Circle(x, y, 1);
            cir.setFill(Color.RED);
            root.getChildren().addAll(line, cir);
        }




        Scene scene = new Scene(root, width, height);
        //Setting title to the scene
        stage.setTitle("Sample application");
        stage.setFullScreen(true);
        //Adding the scene to the stage
        stage.setScene(scene);

        //Displaying the contents of a scene
        stage.show();
    }

    public static void main(String args[]){
        launch(args);
    }

}