module com.lukemulvihll.speedreadergradle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lukemulvihll.speedreadergradle to javafx.fxml;
    exports com.lukemulvihll.speedreadergradle;
}