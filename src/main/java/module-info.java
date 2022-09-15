module com.example.tabuada {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tabuada to javafx.fxml;
    exports com.example.tabuada;
}