
public class Remoteinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// create reference variable
				Remote remote = new Television();
		remote.powerOn();
		remote.powerOff();
		remote.volumeUp();
		remote.volumeDown();

	}

}
  interface Remote{
	  abstract public void powerOn();
	  abstract public void powerOff();
	  abstract public void volumeUp();
	  abstract public void volumeDown();

  }
  class Television implements Remote{
	  @Override
	  public void powerOn() {
		  System.out.println("PowerOn");
	  }
	  @Override
	  public void powerOff() {
		  System.out.println("PowerOff");
	  } @Override
	  public void volumeUp() {
		  System.out.println("volumeUP");
	  } @Override
	  public void volumeDown() {
		  System.out.println("volumeDown");
	  }
  }