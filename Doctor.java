
public class Doctor extends PatientRecord
{
    private String doctName;
    private String id;
    private String dPhoneNo;
    
    public Doctor(String n, String ic, int d, int a, String p, String dn, String i, String ph)
    {
        super(n,ic,d,a,p);
        doctName = dn;
        id = i;
        dPhoneNo = ph;
    }
    
    public String getdoctName()
    {
        return doctName;
    }
    
    public String getId()
    {
        return id;
    }
    
    public String getPhoneNo()
    {
        return dPhoneNo;
    }
    
    public void setdoctName(String dn)
    {
        doctName = dn;
    }
    
    public void setId(String i)
    {
        id = i;
    }
    
    public void setPhoneNo(String ph)
    {
        dPhoneNo = ph;
    }
    
    public String toString()
    {
        return("Name: " + doctName + "ID: " + id + "Phone No: " + dPhoneNo);
    }
    
    public double doctServiceFee()
    {
        double dFee = 5.00;
        
        return dFee;
    }
}

