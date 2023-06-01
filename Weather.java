//Ashab Naveed
//Computer Science 20
//Henry Wise Wood High School
//2022-2023 Semester 2


import java.text.DecimalFormat;

public class Weather {

  //initalizes two variables, one string and one double.
  String weatherCondition;
  double temperature;

  //decimal formatting to be used later on when rounding values
  public static final DecimalFormat d = new DecimalFormat("0.00");
  
  //sets condition to sunny and temp to 20 celcius by default if no parameter is taken
  public Weather () {
    weatherCondition = "Sunny";
    temperature = 20;
  }

  //takes in two parameters for the weather, which are the temperature in celsius and the condition as a string. Sets the weather condition to the condition inputted and the temperature to the celcius temperature.
 public Weather (String condition, double temperatureCelsius) {
  this.setWeatherCondition(condition); 
  temperature = temperatureCelsius;
 }
  
  //accessors for the weather and temperature variables, returning their values.
  public double getTemperature () 
  { System.out.println("The temperature is currently " + temperature);
    return this.temperature; }

  public String getWeatherCondition () 
  { System.out.println("The weather condition is currently " + weatherCondition);
    return this.weatherCondition; }

  //set the temperature 
  public void setTemperature (double temp)
  {temperature = temp; 
   System.out.println("The temperature has been set to " + temperature);}

  //sets the weather condition to the parameter string, and checks if the value is one of the accepted weather conditions. If not, the weather is set to Sunny once again.
  public void setWeatherCondition (String condition) {
    if (condition != "Sunny" && condition!= "Cloudy" && condition != 
        "Raining" && condition != "Snowing"){
      weatherCondition = "Sunny"; 
      System.out.println("The inputted weather condition is invalid. The condition has been reset to Sunny.");
    } else {
      weatherCondition = condition;
      System.out.println("The condition has successfully been set to " + condition);
    }
  }
  
  //celcius temperature to fahrenheit conversion using the celcius to farenheit calculation, and returns + prints the farenheit temperature

  public double fahrenheitTemperature(){
    double farenheit = (temperature * 1.8) + 32;
    System.out.println("The temperature in farenheit is " + farenheit + " degrees");
    return farenheit;
  }

  //converts the values into a string and stores this as the variable res. Res has the temperature rounded to two decimal places and then is printed and returned.
  public String toString(){

    String res  = "The current weather is " + weatherCondition + " and it is " + d.format(temperature) + " degrees celsius";

    System.out.println(res);
    return(res);
  }
}