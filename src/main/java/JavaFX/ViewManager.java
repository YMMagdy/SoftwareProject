/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaFX;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javafx.scene.text.Font;
import javafx.stage.Screen;
import javafx.stage.Stage;


/**
 *
 * @author Leo
 */
public class ViewManager {
    Rectangle2D bounds=Screen.getPrimary().getVisualBounds();
    private Stage mainstage;
    private Scene mainscene;
     private BorderPane pane;
     private HBox hb;
     private StackPane sp;
     private static double buttonheight = 70;
     private static final String font="Verdana";
//     private static final String url ="JavaFX/logo_transparent.png";
//     private static final String img1 = "Import/1.jpeg";
     public ViewManager(){
     pane=new BorderPane();
     hb=new HBox();
     sp= new StackPane();
     pane.setCenter(sp);
     hb.setPrefSize(bounds.getWidth(), 40);
     mainscene=new Scene(pane,bounds.getWidth(),bounds.getHeight());
     
     mainstage=new Stage();
     mainstage.setScene(mainscene);
     hb.setAlignment(Pos.CENTER_RIGHT);
     
     pane.setTop(hb);
     buttons();
     createBackground();
     }
     
     public void buttons(){
    Button home=new Button("Home");
    Button contact=new Button("Contact");
    Button location=new Button("Location");
    Button policy=new Button("Policy");
    home.setFont(Font.font(font));
    contact.setFont(Font.font(font));
    location.setFont(Font.font(font));
    policy.setFont(Font.font(font));
    home.setTextFill(Color.WHITE);
    location.setTextFill(Color.WHITE);
    policy.setTextFill(Color.WHITE);
    contact.setTextFill(Color.WHITE);
    home.setOnMouseEntered((MouseEvent event) -> {
         home.setEffect(new DropShadow());
    });
    home.setOnMouseExited((MouseEvent event) -> {
            home.setEffect(null);
        });
    contact.setOnMouseEntered((MouseEvent event) -> {
         contact.setEffect(new DropShadow());
    });
        contact.setOnMouseExited((MouseEvent event) -> {
            contact.setEffect(null);
        });
    location.setOnMouseEntered((MouseEvent event) -> {
         location.setEffect(new DropShadow());
    });
        location.setOnMouseExited((MouseEvent event) -> {
            location.setEffect(null);
        });
        
    policy.setOnMouseEntered((MouseEvent event) -> {
         policy.setEffect(new DropShadow());
    });
        policy.setOnMouseExited((MouseEvent event) -> {
            policy.setEffect(null);
        });
    home.setStyle("-fx-background-color:#197f63");
    location.setStyle("-fx-background-color:#197f63");
    policy.setStyle("-fx-background-color:#197f63");
    contact.setStyle("-fx-background-color:#197f63");
    home.setPrefWidth(bounds.getWidth()/4);
    home.setPrefHeight(buttonheight);
    contact.setPrefWidth(bounds.getWidth()/4);
    contact.setPrefHeight(buttonheight);
    location.setPrefHeight(buttonheight);
    policy.setPrefHeight(buttonheight);
    location.setPrefWidth(bounds.getWidth()/4);
    policy.setPrefWidth(bounds.getWidth()/4);
    hb.getChildren().addAll(home,contact,location,policy);
     }  
     
     public Stage getmainstage(){
     return mainstage;
     }
     
     private void createBackground()
    {
        Image img = new Image("JavaFX/logo_transparent.png");
BackgroundImage bgImg = new BackgroundImage(img, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,BackgroundPosition.DEFAULT, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, false));
pane.setBackground(new Background(bgImg));
    }
     
}
