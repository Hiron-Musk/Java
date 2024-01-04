package sub8;

public class Remotesamsung implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("samsung - powerOn...");
		
		
	}

	@Override
	public void powerOff() {
		System.out.println("samsung - powerOff...");
		
		
	}

	@Override
	public void chUp() {
		System.out.println("samsung - chUp...");
		
	}

	@Override
	public void chDown() {
		System.out.println("samsung - chDown...");
	}

	@Override
	public void soundUp() {
		System.out.println("samsung - soundUp...");
		
	}

	@Override
	public void soundDown() {
		System.out.println("samsung - soundDown...");
		
	}

}
