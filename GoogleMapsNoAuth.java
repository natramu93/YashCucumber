package restbasics;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class GoogleMapsNoAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Response r = given().get("https://maps.googleapis.com/maps/api/geocode/json?address=1600+Amphitheatre+Parkway,+Mountain+View,+CA&sensor=false&key=AIzaSyBr2R-p7XvNB593f4EeTcK-bQ9q7NmPGg4");
		System.out.println(r.asString());
		//r.then().body("results[0].address_components[0].long_name",equalTo("Google Building 41"));
		/*Response r = given().auth().form("natarajan.ramanathan93@gmail.com", "Welcome@123").get("https://account.magento.com/customer/account/index/");
		System.out.println(r.asString());*/
	}
}
