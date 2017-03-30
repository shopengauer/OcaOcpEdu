package inheritance;

/**
 * Created by vasiliy on 30.03.17.
 */
public class Guitar extends MusicInstrument {


   // public String name = "Guitar";

    public Guitar() {
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }
}
