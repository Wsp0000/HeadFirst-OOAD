package ch1;

import ch1.enums.Builder;
import ch1.enums.Type;
import ch1.enums.Wood;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class GuitarSpec{
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, int numStrings) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings = numStrings;
    }

    public Builder getBuilder() {return builder;}

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {return numStrings;}

    public List getSpecList() {
        List guitarSpecList = new LinkedList();
        guitarSpecList.add(getBuilder());
        guitarSpecList.add(getModel());
        guitarSpecList.add(getType());
        guitarSpecList.add(getBackWood());
        guitarSpecList.add(getTopWood());
        guitarSpecList.add(getNumStrings());
        return guitarSpecList;
    }

    public boolean matches(GuitarSpec compareSpec){
        List compareSpecList = compareSpec.getSpecList();
        Iterator compareIterator = compareSpecList.iterator();
        Iterator selfIterator = this.getSpecList().iterator();

        System.out.println("print matches method start");
        for (;compareIterator.hasNext();) {
            // print each spec match step
            System.out.println("compareIterator.next():"+compareIterator.next());
            System.out.println("selfIterator.next():"+selfIterator.next());

            if (!(compareIterator.next().equals(selfIterator.next())))
                return false;
        } // close for
        return true;
    } // close method
}
