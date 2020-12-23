package com.musicmachine;

import com.musicmachine.service.WeatherService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@FxmlView("main-scene.fxml")
public class MyController {

    private WeatherService weatherService;

    @FXML
    private Label weatherLabel;

    @Autowired
    public MyController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public void loadWeatherForecast(ActionEvent event) {
        this.weatherLabel.setText(weatherService.getWeatherForecast());
    }
}
