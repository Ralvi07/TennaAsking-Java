/*
 * Decompiled with CFR 0.152.
 *
 * Could not load the following classes:
 *  javafx.application.Application
 *  javafx.geometry.Pos
 *  javafx.scene.Node
 *  javafx.scene.Parent
 *  javafx.scene.Scene
 *  javafx.scene.control.Button
 *  javafx.scene.control.Label
 *  javafx.scene.image.Image
 *  javafx.scene.image.ImageView
 *  javafx.scene.layout.StackPane
 *  javafx.scene.layout.VBox
 *  javafx.scene.media.Media
 *  javafx.scene.media.MediaPlayer
 *  javafx.scene.paint.Color
 *  javafx.scene.paint.Paint
 *  javafx.stage.Stage
 */
import java.util.Random;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class ValentineApp
extends Application {
    VBox ui;
    ImageView background;
    StackPane root;
    boolean check = true;
    Label question;
    Label response;
    Button yesBtn;
    Button noBtn;
    Scene scene;
    Stage stage = new Stage();

    public void start(Stage stage) {
        Image gif = new Image(((Object)((Object)this)).getClass().getResource("/resources/dr_tenna.gif").toExternalForm());
        this.background = new ImageView(gif);
        this.background.setFitWidth(500.0);
        this.background.setFitHeight(350.0);
        this.background.setPreserveRatio(false);
        this.question = new Label("Will you be my Valentine? \ud83d\udc98");
        this.question.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        this.question.setTextFill((Paint)Color.HOTPINK);
        this.response = new Label();
        this.response.setStyle("-fx-font-size: 20px;");
        this.response.setTextFill((Paint)Color.WHITE);
        this.yesBtn = new Button("YES \ud83d\udc96");
        this.noBtn = new Button("NO \ud83d\udc94");
        this.yesBtn.setStyle("-fx-font-size: 16px; -fx-background-color: pink;");
        this.noBtn.setStyle("-fx-font-size: 16px; -fx-background-color: lightgray;");
        this.ui = new VBox(15.0, new Node[]{this.question, this.yesBtn, this.noBtn, this.response});
        this.ui.setAlignment(Pos.CENTER);
        this.root = new StackPane(new Node[]{this.background, this.ui});
        Media media = new Media(((Object)((Object)this)).getClass().getResource("/resources/miketheboard.mp3").toExternalForm());
        MediaPlayer player = new MediaPlayer(media);
        player.setCycleCount(-1);
        player.play();
        this.yesBtn.setOnAction(e -> {
            player.stop();
            this.setHappyTenna();
            this.response.setText("YAY!!! \ud83d\udc95\ud83e\udd70 Happy Valentine\u2019s Day!");
            this.response.setTextFill((Paint)Color.PINK);
            this.yesBtn.setDisable(true);
            this.noBtn.setDisable(true);
        });
        Random random = new Random();
        this.noBtn.setOnMouseEntered(e -> {
            if (this.check) {
                player.stop();
                this.setSadTenna();
                this.check = false;
            }
            this.noBtn.setTranslateX((double)(random.nextInt(300) - 150));
            this.noBtn.setTranslateY((double)(random.nextInt(200) - 100));
        });
        this.scene = new Scene((Parent)this.root, 500.0, 350.0);
        this.stage.setTitle("\ud83d\udc9d Valentine Question \ud83d\udc9d");
        this.stage.setScene(this.scene);
        this.stage.show();
    }

    public void setSadTenna() {
        Image gif = new Image(((Object)((Object)this)).getClass().getResource("/resources/tennacrazy.gif").toExternalForm());
        this.background = new ImageView(gif);
        this.background.setFitWidth(500.0);
        this.background.setFitHeight(350.0);
        this.background.setPreserveRatio(false);
        this.question = new Label("Will you be my Valentine? \ud83d\udc98");
        this.question.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        this.question.setTextFill((Paint)Color.HOTPINK);
        this.response = new Label();
        this.response.setStyle("-fx-font-size: 20px;");
        this.response.setTextFill((Paint)Color.WHITE);
        this.yesBtn = new Button("YES \ud83d\udc96");
        this.noBtn = new Button("NO \ud83d\udc94");
        this.yesBtn.setStyle("-fx-font-size: 16px; -fx-background-color: pink;");
        this.noBtn.setStyle("-fx-font-size: 16px; -fx-background-color: lightgray;");
        this.ui = new VBox(15.0, new Node[]{this.question, this.yesBtn, this.noBtn, this.response});
        this.ui.setAlignment(Pos.CENTER);
        this.root = new StackPane(new Node[]{this.background, this.ui});
        Media media = new Media(((Object)((Object)this)).getClass().getResource("/resources/doomboard.mp3").toExternalForm());
        MediaPlayer player = new MediaPlayer(media);
        player.setCycleCount(-1);
        player.play();
        this.yesBtn.setOnAction(e -> {
            player.stop();
            this.setHappyTenna();
            this.response.setText("YAY!!! \ud83d\udc95\ud83e\udd70 Happy Valentine\u2019s Day!");
            this.response.setTextFill((Paint)Color.PINK);
            this.yesBtn.setDisable(true);
            this.noBtn.setDisable(true);
        });
        Random random = new Random();
        this.noBtn.setOnMouseEntered(e -> {
            this.noBtn.setTranslateX((double)(random.nextInt(300) - 150));
            this.noBtn.setTranslateY((double)(random.nextInt(200) - 100));
        });
        this.scene = new Scene((Parent)this.root, 500.0, 350.0);
        this.stage.setTitle("\ud83d\udc9d Valentine Question \ud83d\udc9d");
        this.stage.setScene(this.scene);
    }

    public void setHappyTenna() {
        Image gif = new Image(((Object)((Object)this)).getClass().getResource("/resources/tennahappy.gif").toExternalForm());
        this.background = new ImageView(gif);
        this.background.setFitWidth(500.0);
        this.background.setFitHeight(350.0);
        this.background.setPreserveRatio(false);
        this.question = new Label("Will you be my Valentine? \ud83d\udc98");
        this.question.setStyle("-fx-font-size: 24px; -fx-font-weight: bold;");
        this.question.setTextFill((Paint)Color.HOTPINK);
        this.response = new Label();
        this.response.setStyle("-fx-font-size: 20px;");
        this.response.setTextFill((Paint)Color.WHITE);
        this.yesBtn = new Button("YES \ud83d\udc96");
        this.noBtn = new Button("NO \ud83d\udc94");
        this.yesBtn.setStyle("-fx-font-size: 16px; -fx-background-color: pink;");
        this.noBtn.setStyle("-fx-font-size: 16px; -fx-background-color: lightgray;");
        this.ui = new VBox(15.0, new Node[]{this.question, this.yesBtn, this.noBtn, this.response});
        this.ui.setAlignment(Pos.CENTER);
        this.root = new StackPane(new Node[]{this.background, this.ui});
        Media media = new Media(((Object)((Object)this)).getClass().getResource("/resources/halloffame.mp3").toExternalForm());
        MediaPlayer player = new MediaPlayer(media);
        player.setCycleCount(-1);
        player.play();
        this.yesBtn.setOnAction(e -> {
            this.response.setText("YAY!!! \ud83d\udc95\ud83e\udd70 Happy Valentine\u2019s Day!");
            this.response.setTextFill((Paint)Color.PINK);
            this.yesBtn.setDisable(true);
            this.noBtn.setDisable(true);
        });
        Random random = new Random();
        this.noBtn.setOnMouseEntered(e -> {
            this.noBtn.setTranslateX((double)(random.nextInt(300) - 150));
            this.noBtn.setTranslateY((double)(random.nextInt(200) - 100));
        });
        this.scene = new Scene((Parent)this.root, 500.0, 350.0);
        this.stage.setTitle("\ud83d\udc9d Valentine Question \ud83d\udc9d");
        this.stage.setScene(this.scene);
    }

    public static void main(String[] args) {
        ValentineApp.launch((String[])new String[0]);
    }
}
