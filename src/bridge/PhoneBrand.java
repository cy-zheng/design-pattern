package bridge;

public abstract class PhoneBrand {
	
	private Software software;

	public void setSoftware(Software software) {
		this.software = software;
	}
	
	public Software getSoftware() {
		return software;
	}

	public abstract void run();
	

}
