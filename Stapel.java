public class Stapel{

    private Listenelement anfang;
    Stapel(){
        anfang = new Abschluss();
    }

    public void push(Datenelement dneu){
        Knoten k = new Knoten(dneu,anfang);
        anfang = k;
    }

    public Datenelement pop(){
        Datenelement d = anfang.delementGeben();
        anfang = anfang.nachfolgerGeben();
        return d;
    }
}