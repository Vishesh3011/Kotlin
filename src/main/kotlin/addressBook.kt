class AddressBook {
    val contacts = mutableListOf<Contact>()

    fun addContact(name: String, email: String, number: String){
        contacts.add(Contact(name, email, number))
    }

    fun listOfContacts(){
        for(contact in contacts){
            println("Name: ${contact.name}")
            println("Email: ${contact.email}")
            println("Number: ${contact.number}")
        }
    }

    data class Contact(val name: String, val email: String, val number: String)
}

