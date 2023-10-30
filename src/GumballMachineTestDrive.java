public class GumballMachineTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine(3);
		
		System.out.println(gumballMachine);
		
		
		gumballMachine.insertQuarter();
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter();
	
		System.out.println(gumballMachine);
	}

}