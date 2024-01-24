public class Huoltaja extends AterioivaOtus{
    public Juoma createJuoma(){
        return new Kahvi();
    };
}
