public class AssistantRegionalManager extends Employee{
	private RegionalManager manager;
	private int minimumTask;
	public AssistantRegionalManager(int IDNumber, String name, Task[] taskList, RegionalManager manager, int minimumTask) {
		this.minimumTask = minimumTask;
		this.manager = manager; //creating the object
		super.setName(name);
		super.setTaskList(taskList);
		super.setIDNumber(IDNumber);
	}
	public RegionalManager getManager(){
		return manager; //getters and setters
	}
	public void setManager(RegionalManager manager){
		this.manager = manager;
	}
	public int getMinimumTask(){
		return minimumTask;
	}
	public void setMinimumTask(int minimumTask){
		this.minimumTask = minimumTask;
	}
	public String toString(){ // to string formatting for when printing
		String returnString = "Assistant Regional Manager\nName: " + super.getName() + "\nID: " + super.getIDNumber() + "\nTask List: \n";
		for(Task a: super.getTaskList()){
			returnString += a.toString() + "\n";
		}
		returnString += "Regional Manager: " + manager.getName() + "\nMinimum Task Level: " + minimumTask;
		return returnString.trim();
	}
	//equals method. Do not edit!
	public boolean equals(AssistantRegionalManager r){
		boolean equal = super.equals(r);
		equal = equal && (r.getMinimumTask() == minimumTask);
		equal = equal && (r.getManager().equals(manager));
		return equal;
	}
}