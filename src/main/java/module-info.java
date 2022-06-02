module ku.cs.mvnfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens ku.cs.mvnfx to javafx.fxml;
    exports ku.cs.mvnfx;
}