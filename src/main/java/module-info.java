module com.navuwo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.navuwo to javafx.fxml;
    exports com.navuwo;
}
