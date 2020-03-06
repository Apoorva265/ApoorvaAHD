package projectjava1;

public class Input {
	int PatientAge;
	public Input(String name) 
	{
		System.out.println("Patient Name is: " + name);
	}
	public void SetAge(int age)
	{
		PatientAge = age;
	}
	public int GetAge()
	{
		System.out.println("Patient's Age is: " + PatientAge);
	return PatientAge;
			}
	public static void main (String args[])
	{
		Input myPatient = new Input("Apoorva");
		myPatient.SetAge (28);
		myPatient.GetAge();
		System.out.println("Variable Value: " + myPatient.PatientAge);
			}
	}