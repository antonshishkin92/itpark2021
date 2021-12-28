package hw14.contact;

import java.util.Collection;
import java.util.HashSet;

public class ContactWithOthers extends Contact {

    private Collection<Contact> LinkedContacts;

    public ContactWithOthers() {
        this.LinkedContacts = new HashSet<>();
    }

    public Collection<Contact> getLinkedContacts() {
        return LinkedContacts;
    }


}
