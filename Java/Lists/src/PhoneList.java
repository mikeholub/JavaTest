import java.util.ArrayList;

public class PhoneList {
    private ArrayList<Contact> myContacts;

    public PhoneList() {
        this.myContacts = new ArrayList<Contact>();
    }

    public void ListOfRecords() {
        System.out.println("List of your phones: ");
        System.out.println("NAME     PHONE ");
        for (int i=0; i<this.myContacts.size(); i++) {
            System.out.println(this.myContacts.get(i).getContactName() + "  " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean AddNewRecord (Contact contact) {
        if (FindRecord(contact.getContactName())>=0) {
            System.out.println(contact.getContactName() + " already exists in the list");
            return false;
        }
        myContacts.add(contact);
        System.out.println(contact.getContactName() + " was successfully added");
        return true;
    }

    public boolean ModifyRecord (Contact oldContact, Contact newContact) {
        int foundPosition = FindRecord(oldContact);
        if (foundPosition<0) {
            System.out.println("Record was not found");
            return false;
        } else {
            this.myContacts.set(foundPosition, newContact);
            System.out.print("Record was successfully updated");
            return true;
        }
    }

    public int FindRecord (Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    public int FindRecord (String searchItem) {
        for (int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (searchItem.equalsIgnoreCase(contact.getContactName())) {
                return i;
            }
        }
        return -1;
    }

    public boolean DeleteRecord (Contact contact) {
        int foundPosition = FindRecord(contact);
        if (foundPosition<0) {
            return false;
        } else {
            this.myContacts.remove(foundPosition);
            return true;
        }
    }

    public Contact queryContact (String name) {
        int position = FindRecord(name);
        if (position>=0) {
            return this.myContacts.get(position);
        }
        else {
            return null;
        }
    }
}