package SampleMaven2.ProjDemo2;

public class Welcome {

	private String message;
	public Welcome() {}
    
    public void initialize()
    {
    	System.out.println("Initialization method...");
    }
    public void destroy()
    {
    	System.out.println("Destroying method...");
    }
	public Welcome(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
