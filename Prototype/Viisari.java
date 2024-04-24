public class Viisari implements Cloneable{
    private int minuutti;
    private int tunti;
    public Viisari(int m, int h){
        minuutti = m;
        tunti = h;
    }

    public String getAika(){
        return tunti + ":" + minuutti;
    }

    public void setAika(int tunti, int minuutti){
        this.tunti = tunti;
        this.minuutti = minuutti;
    }
    public Viisari clone() {
        try {
            return (Viisari) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
