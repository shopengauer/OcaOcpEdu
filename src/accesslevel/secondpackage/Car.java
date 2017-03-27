package accesslevel.secondpackage;

import accesslevel.Vechile;

import java.time.LocalDate;

/**
 * Created by vasiliy on 26.03.17.
 */
public class Car extends Vechile {


    private LocalDate localDate;

    public String getColor(){
        super.localDate = LocalDate.now();
        // также имеем свой собственный localDate
        this.localDate = LocalDate.now();
        // наследуем protected член color класса Vechile
        return color;
    }

    public Vechile createCar(){
        Vechile vechile = new Vechile();
        // но при создании объекта Vechile   protected члены не видны, они толко наследуются
        vechile.localDate = null;
        return vechile;

    }


}
