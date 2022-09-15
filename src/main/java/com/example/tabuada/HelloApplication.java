package com.example.tabuada;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
       // Escreva um programa que informa a tabuada de multiplicação de um número informado pelo
        //usuário (entre 1-10). Exemplo:
        //Entre com um número de 1 a 10:

         for (int i = 1;  i <= 10;  i++ ){
             for (int j = 1;  j <= 10;  j++){
                 System.out.println(j+"x" + i + "=" +j*i);
             }

        }

    }
}