package constructors;
class Software_Testing{
	 void syllabus() {
		 System.out.println("Software Testing course details");
		 System.out.println("Syllabus=Manual Testing, core java, selenium web driver, jira(project management),mysql,postan");
         System.out.println("Fee : 50000");	 
	 }
}
class Manual extends Software_Testing{
	void manual_testing() {
		super.syllabus();
		System.out.println("If is only Manual testing \nthen it includes Manual testing concepts,jira,mysql,postman" );
		System.out.println("Fee : 30000");	 
	}
}
class Automation extends Software_Testing{
	void automation_testing() {
		super.syllabus();
		System.out.println("If is only Manual testing \nthen it includes core java,selenium web driver,mysql,postman" );
		System.out.println("Fee : 30000");	 
	}
}
public class Method_chaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manual m=new Manual();
		m.manual_testing();
		System.out.println("******************************");
        Automation a=new Automation();
        a.automation_testing();
	}

}
