package Static;

public class HondaCity {
static long price=10000;
//int a,b;
static double onRoadPrice(String city) {
	switch(city) {
	
	case"Delhi":
		price= (long) (price+price*.01);
		break;
	case "Mumbi":
		price= (long) (price+price*0.09);
		break;
	
	}
	return price;
   
	
}
}
