package com.epam.autotasks.collections;
import java.util.*;


class RangedOpsIntegerSet extends AbstractSet<Integer> {
    private final TreeSet<Integer> set = new TreeSet<>();


    public boolean add(int fromInclusive, int toExclusive) {

        boolean flag = false;
        for(int i = fromInclusive; i < toExclusive; i++){
           if(!set.contains(i)) flag = true;
           set.add(i);
       }
       return flag;
    }

    public boolean remove(int fromInclusive, int toExclusive) {

        boolean flag = false;
        for(int i = fromInclusive; i < toExclusive; i++){
            if(set.contains(i)){
                set.remove(i);
                flag = true;
            }
        }
    return flag;
    }


    @Override
    public boolean add(final Integer integer) {
        boolean flag = !set.contains(integer);

        set.add(integer);

        return flag;
    }

    @Override
    public boolean remove(final Object o) {
        boolean flag = false;
            if(set.contains(o)){
                set.remove(o);
                flag = true;
            }
        return flag;
    }

    @Override
    public Iterator<Integer> iterator() {
        return set.iterator();
    }

    @Override
    public int size() {
        return set.size();
    }
}



