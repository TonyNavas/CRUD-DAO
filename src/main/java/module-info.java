module com.tony.crud {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.tony.crud to javafx.fxml;
    exports com.tony.crud;
}
