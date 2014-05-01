
public class Service {
	private int serviceCount;
	
	public void service(){
		serviceCount=0;
	}
	
	public void recordService(){	
	serviceCount++;	
	}
	
	public int getServiceCount(){
		return serviceCount;	
	}
	public boolean isDueForService(Journey journey){
		if (serviceCount<journey.getTotalServices())
			return true;
		else 
			return false;				
	}
}




	


	

