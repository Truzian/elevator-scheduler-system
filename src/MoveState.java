
public class MoveState extends State {

	public MoveState(Elevator ele) {
		super(ele);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void moveDoor() {
		// TODO Auto-generated method stub
		System.out.println("Doors are closed while the elevator is moving");
	}

	@Override
	public void moveElevator() {
		// TODO Auto-generated method stub
		elevator.setState(new StopState(elevator));
		try {
			System.out.println("Doors are opening and passenger is entering");
			Thread.sleep(OpenDoorTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
