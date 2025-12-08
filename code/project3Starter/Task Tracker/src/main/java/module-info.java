module edu.westga.cs1302.comic_collections {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
	requires javafx.base;

    opens edu.westga.cs1302.comic_collections.views to javafx.fxml;
    exports edu.westga.cs1302.comic_collections;
}
