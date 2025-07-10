public class Wohnung
{
    private String ort;
    private boolean balkon;
    private int preis;
    private int anzZimmer;
    
    public void setOrt(String newOrt)
    {
        ort = newOrt;
    }
    
    public void setBalkon(boolean newBalkon)
    {
        balkon = newBalkon;
    }
    
    public void setPreis(int newPreis)
    {
        preis = newPreis;
    }
    
    public void setAnzZimmer(int newAnzZimmer)
    {
        anzZimmer = newAnzZimmer;
    }
    
    public String getOrt()
    {
        return ort;
    }
    
    public boolean getBalkon()
    {
        return balkon;
    }
    
    public int getPreis()
    {
        return preis;
    }
    
    public int getAnzZimmer()
    {
        return anzZimmer;
    }
}