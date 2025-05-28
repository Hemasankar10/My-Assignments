package week4.day1;

public class APIClient {

	public void sendRequest(String endPoint) {
		System.out.println("EndPoint Request");
	}
	
	public void sendRequest(String endpoint, String requestbody, boolean requestStatus) {
		System.out.println("ENDPOINT");
		System.out.println("REQUESTBODY");
		System.out.println("REQUESTSTATUS");
	}
	
	
	public static void main(String[] args) {

		APIClient overLoading=new APIClient();
		overLoading.sendRequest("req");
		overLoading.sendRequest("EP", "reqbody", true);
	}

}
