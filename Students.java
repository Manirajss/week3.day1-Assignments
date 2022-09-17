package week3.day1;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("The Student ID is: "+ id);
	}
	public void getStudentInfo(int id, String name) {
		//System.out.println("The Student ID is: "+ id);
		System.out.println("Name of the student is: "+name);
	}
	public void getStudentInfo(String email,long phoneno) {
		System.out.println("The Student E-mail ID is: "+ email);
		System.out.println("Phone number: "+phoneno);
	}
	public static void main(String[] args) {
		Students obj=new Students();
		obj.getStudentInfo(54321);
		obj.getStudentInfo(54321, "M.Rajalakshmi");
		obj.getStudentInfo("abcd@gmail.com", 987654321);
	}

}
