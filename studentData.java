package StudentDataFinal;

public class studentData {
	
	private String studentName;
    private String address;
    private double GPA;

    public studentData(String studentName, String address, double GPA) {
        this.studentName = studentName;
        this.address = address;
        this.GPA = GPA;
    }

    public String getstudentName() {
        return studentName;
    }

     public double getGPA() {
        return GPA;
    }
     
     public String getAddress() {
        return address;
    }

   

    @Override
    public String toString() {
        return "Name / Address / GPA:" + studentName +"/" + address +"/"+ GPA + "\n";
    }
}


