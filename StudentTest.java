package in.ineuron.abstractPractise;

abstract class Student
{
	private String name;
	private int []test;
	private String result;
	public float sum;
	
	//constructor
	public Student(String name) {
		super();
		this.name = name;
	}
	
	//Getters and setters to get and set the value 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getTest() {
		return test;
	}

	public void setTest(int[] test) {
		this.test = test;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	public void setTestScore(int testNumber ,int []testScore)
	{
		
		for(int i=0;i<testNumber;i++)
		{
			test[i]=testScore[i];
			sum+=test[i];
		}
		
	}
	
	 abstract public void generateResult();
	
}

class UndergraduateStudent extends Student
{

	public UndergraduateStudent(String name) {
		super(name);
		
	}
	
	public void generateResult()
	{
		float averageMarks=0;
		
		averageMarks=(sum)/4;
		String result=null;
		
		
		if(averageMarks>=60)
		{
			result="Pass";
		}
		else if(averageMarks<60)
		{
			result="Fail";
		}
		System.out.println(result);
	}
	
}

class GraduateStudent extends Student
{

	public GraduateStudent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void generateResult()
	{
		float averageMarks=0;
		averageMarks=(sum)/4;
		String result=null;
		
		if(averageMarks>=70)
		{
			result="Pass";
		}
		else if(averageMarks<70)
		{
			result="Fail";
		}
		System.out.println(result);
	}
	
}
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new UndergraduateStudent("Mehul");
		Student s2=new GraduateStudent("Ajay");
		int [] marks = new int[4];
		marks[0]=70;
		marks[1]=69;
		marks[2]=71;
		marks[3]=55;
		s2.setTest(marks);
		s2.setTestScore(4, marks);
		s2.generateResult();
		
		int [] marks1 = new int[4];
		marks1[0]=70;
		marks1[1]=69;
		marks1[2]=71;
		marks1[3]=55;
		s1.setTest(marks1);
		s1.setTestScore(4, marks1);
		s1.generateResult();
	}

}
