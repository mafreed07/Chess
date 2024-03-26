module com.mycompany.chess {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.chess to javafx.fxml;
    exports com.mycompany.chess;
}
