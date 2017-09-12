package org.pltw.examples.weather;

/**
 * Created by wdumas on 3/3/16.
 */
public class WeatherConditionals {
    public static String getWeatherAdvice(int temperature, String description)
    {
        boolean windy = false;
        String advice = "";
        if(description.indexOf("windy") >= 0)
            windy = true;
        if(temperature > 100 && description.indexOf("snow") >= 0)
            advice = "This is not possible. ";
        if(windy == false && temperature > 30)
            advice = advice + ("It's safe to go outside, " + temperature + " degrees and " + description + ".");
        else
            advice = advice + ("Too windy or cold! Enjoy watching the weather through the window.");
        return advice;
    }

    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description)
    {
        String advice = "";
        if(temperature >= 65 && description.toUpperCase().equals("Cloudy"))
            advice = "You're in San Jose.";
        else if(description.toUpperCase().equals("Fair"))
            advice = "You're in Santa Fe.";
        else if(temperature < 65 && windchill < 65)
            advice = "You're in San Francisco.";
        else if(temperature > 80 && description.toUpperCase().equals("Hot"))
            advice = "You're in Dublin.";
        else if(humidity > 70 && description.toUpperCase().equals("Smoky"))
            advice = "You're in Death Valley.";
        else
            advice = "Bring an Umbrella!";
        return advice;
    }


}
