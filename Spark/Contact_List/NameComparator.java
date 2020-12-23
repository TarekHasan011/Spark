// 
// Decompiled by Procyon v0.5.36
// 

package Contact_List;

import java.util.Comparator;

public class NameComparator implements Comparator
{
    @Override
    public int compare(final Object o1, final Object o2) {
        final Contact contact1 = (Contact)o1;
        final Contact contact2 = (Contact)o2;
        return contact1.name.compareTo(contact2.name);
    }
}
