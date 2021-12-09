
public class Medicine extends PatientRecord
{
    private String typeM;
    private double price;
    
    public Medicine(String n, String ic, int d, int a, String p, String tm, double f)
    {
        super(n,ic,d,a,p);
        typeM = tm;
        price = f;
    }
    
    public String getTypeMedicine()
    {
        return typeM;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setType(String tm)
    {
        typeM = tm;
    }
    
    public void setPrice(double p)
    {
        price = p;
    }
    
    public String toString()
    {
        return("Type: " + typeM + "Price: " +price);
    }
    
    public double calcMedPay()
    {
        double fees = 0.0;
        if(super.getDisease()==1)
            fees = 40.00;
        else if(super.getDisease()==2)
            fees = 30.00;
        else if(super.getDisease()==3)
            fees = 20.00;
        else
            fees = 60.00;
            
        return fees;
    }
}