class Course{
	private List<Student> students;
	
	public Course(List<Student> students){
		this.students = students;
	}
	
	public int numSignatures(){
		int num = 0;
		for ( int i = 0 ; i < students.size(); i++ ){
			if ( students.get(i).hasSignature() ) num++;
		}
		return num;
	}
	
	public void addStudent(Student newStudent){
		students.add(newStudent);
	}
	
	public void removeStudent(Student studentToRemove){
		students.remove(studentToRemove);
	}
	
	public double avgLabPoints(){
		double sum = 0;
		for (int i  = 0; i < this.students.size(); i++ ){
			if ( this.students.get(i).hasSignature() ){
				sum+=this.students.get(i).getAverage();
			}
		}
		return sum/numSignatures();
	}
}