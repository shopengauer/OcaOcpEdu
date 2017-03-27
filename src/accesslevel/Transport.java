package accesslevel;

import java.time.LocalDate;

/**
 * Created by vasiliy on 27.03.17.
 */
public class Transport {

    // Класс в том же пакете что и Vechile
    private void goTransport(){
        Vechile vechile = new Vechile();
        vechile.model = "Red"; // это package-private
        vechile.color = "Green"; // это protected
        vechile.localDate = LocalDate.now(); // и public
       // vechile.name  - не виден так как private
    }

}
