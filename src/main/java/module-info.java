module org.example.quanlycauhoi {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.quanlycauhoi to javafx.fxml;
    exports org.example.quanlycauhoi;
}