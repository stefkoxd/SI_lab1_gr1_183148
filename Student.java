class Student {
	String index;
	String firstName;
	String lastName;
	List<Integer> labPoints;
    
	//TODO constructor
	public Student(String index, String firstName, String lastName, List<Integer> labPoints){
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.labPoints = labPoints;
	}
	//TODO seters & getters
	public String getIndex(){
		return this.index;
	}
	
	public void setIndex(String index){
		this.index = index;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setFirstName(String name){
		this.firstName = name;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public void setLastName(String lastname){
		this.lastName = lastname;
	}
	
	public List getLabPoints(){
		return this.labPoints;
	}
	
	public void setLabPoints(List<Integer> pts){
		this.labPoints = pts;
	}
	
	
	public double getAverage() {
		double sum = 0;
		for ( int i = 0; i < this.labPoints.size(); i++ ) {
			sum+=this.labPoints.get(i);
		}
		return sum/this.labPoints.size();
	}

	public boolean hasSignature() {
		//TODO
		return this.labPoints.size() > 8;
	}
}
