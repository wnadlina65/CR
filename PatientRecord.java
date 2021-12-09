
public abstract class PatientRecord
{
    private String name;
    private String icNo;
    private int disease;
    private int age;
    private String phoneNo;
    
    public PatientRecord (String n, String ic, int d, int a, String p)
    {
        name = n;
        icNo = ic;
        disease = d;
        age= a;
        phoneNo = p;
        
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getICNo()
    {
        return icNo;
    }
    
    public int getDisease()
    {
        return disease;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getPhoneNo()
    {
        return phoneNo;
    }
    
    public void setName(String n)
    {
        name = n;
    }
    
    public void setICNo(String ic)
    {
        icNo = ic;
    }
    
    public void setDisease(int d)
    {
        disease = d;
    }
    
    public void setAge(int a)
    {
        age = a;
    }
    
    public void setPhoneNo(String p)
    {
        phoneNo = p;
    }
    
    /*public void setPayment(double pay)
    {
        payment = pay;
    }*/
    
    public String toString()
    {
       return ("Name: " + name + "IC No: " + icNo + "Disease: " + disease + "Age: " + age + "Phone No: " + phoneNo);
    }
    
}