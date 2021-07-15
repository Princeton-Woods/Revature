
public class Lab_9_10 {

	public static void main(String[] args) {
        int precipitation = 0;
        int waterOutput = 0;
        int temperature = 62;

        //start an if-statement
        if (precipitation < 20){
        	if(temperature <= 75 ) {
            waterOutput = 30;
        	}
        	else {
        		waterOutput = 30;
        	}
        }else if (precipitation < 31){
        	if (temperature <= 75){
                waterOutput = 10;
            }
            else {
                waterOutput = 25;
            } 
        }else if (precipitation < 56){
        	if (temperature <= 75){
                waterOutput = 0;
            }
            else {
                waterOutput = 15;
            }
        }else {
        	waterOutput = 0;
        }

        System.out.println("The water output should be " + waterOutput);
        
        //********************************************************************
        
        int x = 10;
        switch(x) {
        	case 6:System.out.println("case 6 ran");
        		break;
        	default: System.out.println("the default case ran. ");
        		break;
        	case 7:System.out.println("case 7 ran");
        		break;
        	case 10: System.out.println("case 10 ran");
        	
        }
	}

}
