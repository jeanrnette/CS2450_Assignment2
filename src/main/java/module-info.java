module com.cs2450_assignment2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.cs2450_assignment2 to javafx.fxml;
    exports com.cs2450_assignment2;
}
