public class Wohnung
{
    private String ort;  // Wo der Wohnung sich befindet.
    private boolean balkon; //Ob die Wohnung Balkon hat (Ja oder Nein).
    private int preis;      // Wie viel der Wohnung kostet.
    private int anzZimmer; // Wie viele Zimmer der Wohnung hat.
    
    /*
     * Constructor
     * It is creating a new Instance of the class Wohnung.
     */
    public Wohnung(String newOrt, boolean newBalkon, int newPreis, int newAnzZimmer)
    {
        setOrt(newOrt);
        setBalkon(newBalkon);
        setPreis(newPreis);
        setAnzZimmer(newAnzZimmer);
    }
    
    public void setOrt(String newOrt)
    {
        //Die Eigenschaft ort wird auf den Wert den übergebenen Parameters newOrt gesetzt.
        ort = newOrt;
    }
    
    public void setBalkon(boolean newBalkon)
    {
        // Die Eigenschaft balkon wird überschrieben mit dem Wert des Parameters (newBalkon).
        balkon = newBalkon;
    }
    
    public void setPreis(int newPreis)
    {
        // Die Eigenschaft preis wird auf den Wert den übergebenen Parameters gesetzt.
        preis = newPreis;
    }
    
    public void setAnzZimmer(int newAnzZimmer)
    {
        // Die Eigenschaft anzZimmer wird auf den Wert den übergebenen Parameter gesetzt.
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
    
    public void printWohnung()
    {
        System.out.println("Es befindet sich in " + ort + ", Balkon: " + balkon + " und es hat " + anzZimmer + " Zimmer und die Wohnung kostet " + preis + " Euro."
        );
    }
}