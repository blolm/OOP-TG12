package E003UebungKlassenarbeit;

public abstract class Zelle {

    protected int x;
    protected int y;

    public Zelle(int pX, int pY) {
        this.x = pX;
        this.y = pY;
    }

    public boolean hatGleicheXY(int pX, int pY){
        return false;
    }    

    public abstract void zeichne(Zeichenflaeche g);

    public int gibX() {
        return x;
    }

    public int gibY() {
        return y;
    }

    public void setzeY(int pY) {
        this.y = pY;
    }

    public void setzeX(int pX) {
        this.x = pX;
    }

}
