import util.Scanner;
public class TemperatureConverter
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(system.in);
		System.out.println("Temperature Conversion Program");
		System.out.println("Enter temperature value: ");
		double temperature=s.nextDouble();
		System.out.println("Enter the units of measurements [Celsius, Fahrenheit or Kelvin]");
		s.nextLine();
		String originalUnit=s.nextLine().tolowercase();
		double converterTemperatureCelsius=0;
		double converterTemperatureFahrenheit=0;
		double converterTemperatureKelvin=0;
		if(originalUnit.equals("celsius"))
		{
			converterTemperatureCelsius=temperature;
			converterTemperatureFahrenheit=(temperature*9/5)+32;
			converterTemperatureKelvin=temperature+273.15;
		}
		else if(originalUnit.equals("fahrenheit"))
		{
			converterTemperatureCelsius=(temperature-32)*5/9;
			converterTemperatureFahrenheit=temperature;
			converterTemperatureKelvin=(temperature-32)*5/9 +273.15;
		}
		else if(originalUnit.equals("kelvin"))
		{
			converterTemperatureCelsius=5-273.1;
			converterTemperatureFahrenheit=(temperature-273.15)*9/5 +32;
			converterTemperatureKelvin=temperature;
		}
		else
		{
			System.out.println("Invalid Unit of measurement.Please enter Celsius, Fahrenheit or kelvin.");
			System.exit(1);
		}
		System.out.println("***Converted Temperatures***");
		System.out.println("Celsius"+converterTemperatureCelsius+"°C");
		System.out.println("Fahrenheit"+converterTemperatureFahrenheit+"°F");
		System.out.println("kelvin"+converterTemperatureKelvin+"K");
		s.close();
	}
}