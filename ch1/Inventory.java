package ch1;

import ch1.enums.Builder;
import ch1.enums.Type;
import ch1.enums.Wood;

import java.util.LinkedList;
import java.util.List;

public class Inventory {
    List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }
    public void addGuitar(String serialNumber,
                          double price,
                          GuitarSpec spec
                          ){
//                          Builder builder,
//                          String model,
//                          Type type,
//                          Wood backWood,
//                          Wood topWood){
        guitars.add(new Guitar(serialNumber,
                price,
//                new GuitarSpec(builder,
//                        model,
//                        type,
//                        backWood,
//                        topWood)));
                spec));
    }
    public Guitar getGuitar(String serialNumber){
        for (Guitar guitar :
                guitars) {
                if (serialNumber.equals(guitar.getSerialNumber())) {
                    return guitar;
                }
        } // close foreach loop

//        for (Iterator i = guitars.iterator();
//        i.hasNext();){
//            Guitar guitar = (Guitar) i.next();
//            if (guitar.getSerialNumber().equals(serialNumber))
//                return guitar;
//        } // close for loop
        return null;
    }
    public List<Guitar> search(GuitarSpec searchGuitarSpec){
        List<Guitar> matchGuitars = new LinkedList<>();
        for (Guitar guitar :
                guitars) {
            
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            GuitarSpec guitarSpec = guitar.getSpec();

            if (guitarSpec.matches(searchGuitarSpec)) {
                matchGuitars.add(guitar);
                // test sout
                System.out.println("test GuitarSpec matches method start");
                System.out.println("found a guitar serialNumber:"+guitar.getSerialNumber());
                System.out.println("test GuitarSpec matches method end");
            }
            // old
//            if ((searchGuitarSpec.getBuilder()) != guitarSpec.getBuilder()) {
//                continue;
//            }
//            String model = searchGuitarSpec.getModel();
//            if ((model != null) && (model.equals("")) &&
//                    (!model.equals(guitarSpec.getModel().toLowerCase())) ){
//                continue;
//            }
//            if ((searchGuitarSpec.getType()) != guitarSpec.getType()) {
//                continue;
//            }
//            if ((searchGuitarSpec.getBackWood()) != guitarSpec.getBackWood()) {
//                continue;
//            }
//            if ((searchGuitarSpec.getTopWood()) != guitarSpec.getTopWood()) {
//                continue;
//            }
//            matchGuitars.add(guitar);
            //find a guitarSpec equals(all if fail) searchGuitarSpec
        } // close foreach loop
        return matchGuitars;
        // Interrupt search method and return matchGuitars(maybe empty List)

    } // close search method
}
