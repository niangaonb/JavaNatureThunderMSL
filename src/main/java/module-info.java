module com.niangaoa.jnmtsl {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.niangaoa.jnmtsl to javafx.fxml;
    exports com.niangaoa.jnmtsl;
    exports com.niangaoa.jnmtsl.Controller;
    opens com.niangaoa.jnmtsl.Controller to javafx.fxml;
}