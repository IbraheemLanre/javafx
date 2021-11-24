module com.example.newtaskexample {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newtaskexample to javafx.fxml;
    exports com.example.newtaskexample;
}