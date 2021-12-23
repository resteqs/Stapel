public class Knoten extends Listenelement
{
    private Listenelement nachfolger;
    private Datenelement delement;
    public Knoten(Datenelement d)
    {
        super();
        delement = d;
        nachfolger = new Abschluss();
    }
    public Knoten(Datenelement d, Listenelement l)
    {
        super();
        delement = d;
        nachfolger = l;
    }
    public Datenelement delementGeben(){
        return delement;
    }
    public Listenelement nachfolgerGeben(){
        return nachfolger;
    }
}
