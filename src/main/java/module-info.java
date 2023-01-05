module com.example.java_giorgi_shavlokhashvili {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.java_giorgi_shavlokhashvili to javafx.fxml;
    exports com.example.java_giorgi_shavlokhashvili;
}