public class RegionalManager extends Employee {
	private int RegionNum;
	private Employee[] subordinates;
	private int minimumTask;

	public RegionalManager(int IDNumber, String name, Task[] taskList, int RegionNum, Employee[] subordinates, int minimumTask){
		super.setIDNumber(IDNumber);
		super.setName(name);
		super.setTaskList(taskList);
		this.RegionNum = RegionNum;
		this.subordinates = subordinates;
		this.minimumTask = minimumTask;
	}
	public RegionalManager(int IDNumber, String name, Task[] taskList, int RegionNum, int minimumTask){
		super.setIDNumber(IDNumber);
		super.setName(name);
		super.setTaskList(taskList);
		this.RegionNum = RegionNum;
		this.minimumTask = minimumTask;
	}
	public int getRegionNum(){ //getters and setters
		return RegionNum;
	}
	public void setRegionNum(int RegionNum){
		this.RegionNum = RegionNum;
	}
	public Employee[] getSubordinates(){
		return subordinates;
	}
	public void setSubordinates(Employee [] subordinates){
		this.subordinates = subordinates;
	}
	public int getMinimumTask(){
		return minimumTask;
	}
	public void setMinimumTask(int minimumTask){
		this.minimumTask = minimumTask;
	}
	public String toString(){  // string method for formatting when printing
		String returnString = "Regional Manager\nName: " + super.getName() + "\nID: " + super.getIDNumber() + "\nTask List: \n";
		for(Task a: super.getTaskList()){
			returnString += a.toString() + "\n";
		}
		returnString += "Region Number: " + RegionNum + "\nMinimum Task Level: " + minimumTask + "\nEmployees: \n";
		for(Employee a: subordinates){
			returnString += a.toString() + "\n";
		}
		return returnString.trim();
	}
	//equals method. Do not edit!
	public boolean equals(RegionalManager r){
		boolean equal = super.equals(r);
		equal = equal && (r.getRegionNum() == RegionNum);
		equal = equal && (r.getMinimumTask() == minimumTask);
		for(int i = 0; i < subordinates.length; i++){
			equal = equal && (subordinates[i].equals(r.getSubordinates()[i]));
		}
		return equal;
	}
}