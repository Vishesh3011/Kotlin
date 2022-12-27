fun testAddContact() {
    val book = AddressBook()
    book.addContact("Alice", "alice@example.com", "555-555-1234")
    assert(book.contacts.size == 3)
    assert(book.contacts[0].name == "Alice")
    assert(book.contacts[0].email == "alice@example.com")
    assert(book.contacts[0].number == "555-555-1234")
}

fun main(){
    val book = AddressBook()
    book.addContact("Vishesh", "modivishesh30@gmail.com", "7977212360")
    book.addContact("Bharti", "modib311@gmail.com", "9099349745")
    book.listOfContacts()

    testAddContact()

    book.listOfContacts()
}