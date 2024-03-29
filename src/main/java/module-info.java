module com.example.battlemonkeys2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.battlemonkeys2 to javafx.fxml;
    exports com.example.battlemonkeys2;
}