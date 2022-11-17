module com.example.tarean2_juanpa_quesada_caballero_v2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.View to javafx.fxml;
    exports com.example.View;
}