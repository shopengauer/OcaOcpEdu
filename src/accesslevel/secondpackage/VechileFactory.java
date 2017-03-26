package accesslevel.secondpackage;

import accesslevel.Vechile;

import java.time.LocalDate;

/**
 * Created by vasiliy on 26.03.17.
 */
public class VechileFactory {

    // в другом пакете видим только публичные члены класса Vechile
    public Vechile createVechile(){
       Vechile vechile = new Vechile();
       vechile.localDate = LocalDate.now();
       return vechile;
    }


}
