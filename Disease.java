
public class Disease extends PatientRecord
{
    private int typeDisease;
    //private Medicine m;
    
    public Disease (String n, String ic, int d, int a, String p, int td)
    {
        super(n,ic,d,a,p);
        typeDisease = td;
        //m = new Medicine(n,ic,d,a,p,td,tm,f);
    }
    
    public int getTypeDisease()
    {
        return typeDisease;
    }
    
    public void setTypeDisease(int t)
    {
        typeDisease = t;
    }
    
    public String toString()
    {
        return("Type of disease: " + typeDisease);
    }
    
}
