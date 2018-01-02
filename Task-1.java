public class Task {
    private String name;
    private int level;
    public Task(String name, int level){ //method to create task
    	this.name = name;
    	this.level = level;
    }
    public String getName(){ // get methods
    	return name;
    }
    public int getLevel(){
    	return level;
    }
    public String toString(){
    	return "\tTask: " + name + "\tLevel: " + level;
    }
	//equals method. Do not edit!
	public boolean equals(Task t){
		return ((t.getLevel() == level) && (t.getName().equals(name)));
	}
}