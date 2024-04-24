public class Kello implements Cloneable{
    private Viisari aika;

    public Kello(int tunti, int minuutti){
        aika = new Viisari(tunti, minuutti);
    }   

    public void getAika(){
        System.out.println(aika.getAika());
    }

    public void setAika(int tunti, int minuutti){
        aika.setAika(tunti, minuutti);
    }

    
    public Kello clone(){
        // syväkopio
            Kello k = null;
            try{
                k = (Kello) super.clone();
                k.aika = (Viisari) aika.clone();
            } catch (CloneNotSupportedException e){
                e.printStackTrace();
            }
            return k;
        }

        // matalaklooni
        public Kello matalaKlooni(){
            try{
                return (Kello) super.clone();
            } catch (CloneNotSupportedException e){
                return null;
            }
        }
}
