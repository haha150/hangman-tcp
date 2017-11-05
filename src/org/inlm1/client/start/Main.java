package org.inlm1.client.start;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.inlm1.client.controller.Controller;
import org.inlm1.client.view.ChatView;

public class Main extends Application {

    /**
     * Create the view and scene and start the program
     * @param primaryStage the specified stage
     */
    @Override
    public void start(Stage primaryStage) {
        ChatView view = new ChatView(primaryStage);
        Scene scene = new Scene(view, 400, 400);
        Controller controller = new Controller(view);
        view.addEventHandlers(controller);
        
        primaryStage.setTitle("Chat");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
