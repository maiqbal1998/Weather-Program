import java.util.*;

public class Weather {

	public static void main(String[] args) {
		state currentWeather = state.OVERCAST;
		boolean finished = false;

		while(!finished) {
			System.out.println("Weather state : " + currentWeather);
			System.out.print("Enter i for improving, d for deteriorating: ");
			Scanner s = new Scanner(System.in);
			String line = s.nextLine();
			char command = line.charAt(0);
			
			switch(command) {
				case 'i': currentWeather = improveState(currentWeather);
					break;
				case 'd': currentWeather = worsenState(currentWeather);
					break;
				default: finished = true; //any other char ends program
			}
		}
	}
	
	public static state improveState (state present) {
		switch(present)
		{
		case RAINING:
			return state.OVERCAST;
		default:
			return state.SUNNY;
		}
	}
	
	public static state worsenState (state present) {
		switch(present)
		{
		case SUNNY:
			return state.OVERCAST;
		default:
			return state.RAINING;
		}
	}
	
	public enum state {
		SUNNY, OVERCAST, RAINING;
	}

}

