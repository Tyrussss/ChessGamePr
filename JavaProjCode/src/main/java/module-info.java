module apt.tyrus {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;

    opens apt.tyrus to javafx.fxml;
    exports apt.tyrus;
}