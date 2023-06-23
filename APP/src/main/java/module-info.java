module com.example.controlebb {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.APP to javafx.fxml;
    exports com.example.APP;
}