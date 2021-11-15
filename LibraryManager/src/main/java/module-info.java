module com.snippyvalson.librarymanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.snippyvalson.librarymanager to javafx.fxml;
    exports com.snippyvalson.librarymanager;
}