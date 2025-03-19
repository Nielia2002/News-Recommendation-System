module com.example.news_recommendation_system {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.news_recommendation_system to javafx.fxml;
    exports com.example.news_recommendation_system;
}