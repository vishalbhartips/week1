package org.ps;
import java.util.*;

public final class ImmutableClass {
    private final List<String> list;
    private final Date date;

    public ImmutableClass(List<String> list, Date date) {
        this.list = list;
        this.date = new Date(date.getTime());
    }

    public List<String> getList() {
        return list;
    }

    public Date getDate() {
        return new Date(date.getTime());
    }
}
