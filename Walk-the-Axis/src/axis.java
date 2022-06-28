
public class axis {
	boolean[] switches;
	int index = 0;
	int travel = 0;
	boolean rightWard = true;
	
	public axis(int size) {
		switches = new boolean[size+1];
	}
	
	boolean getSwitch(int i) {
		if(i == -1 || i == switches.length) return true;
		else return switches[i];
	}
	
	public boolean travel() {
		if(getSwitch(index+1)) {
			travelLeft();
			return switches[index+1];
		}
		else {
			travelRight();
			return switches[index-1];
		}
		
	}
	
	public void travelRight() {
		while(!getSwitch(index+1)) {
			travel++;
			index++;
		}
		switches[index] = true;
	}
	
	public void travelLeft() {
		while(!getSwitch(index-1)) {
			travel++;
			index--;
		}
		switches[index] = true;
	}
	
	public int run() {
		while(!travel()) {}
		return travel;
	}
	
}
