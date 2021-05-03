package kodlamaIo2;

public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.id=1;
		instructor.firstName="Engin";
		instructor.lastName="Demiroğ";
		instructor.nationalIdentity="12345678912";
		instructor.instructorNumber="88888";
		
		Student student = new Student();
		student.id=4;
		student.firstName="İlayda";
		student.lastName="Durlanık";
		student.nationalIdentity="123462548374";
		student.studentNumber="3333";
		
		
        
        UserManager userManager = new UserManager();
        
        User[] users = {instructor,student};
       
        userManager.addMultiple(users);
      
        
        
        
		

	}

}
