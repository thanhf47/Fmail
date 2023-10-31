package vn.edu.hust.fmail

class Datasource {
    fun loadData() : ArrayList<Item> {
        return arrayListOf(
            Item("Thanh", "i am ironman", "10:00 AM"),
            Item("Nguyen", "i am not ironman", "10:01 AM"),
            Item("Tien", "am i ironman", "10:02"),
            Item("Nguyen Tien Thanh", "are you ironman?", "10:03 AM"),
            Item("Human", "nothing to talk", "6:00 PM"),
            Item("Dog", "goof goff", "6:01 PM"),
            Item("Cat", "meow meow", "6:02 PM"),
            Item("Duck", "cap cap", "6:03 PM"),
            Item("Alien", "??????", "12:00 PM"),
            Item("Thanh Nguyen", "hello", "1:00 AM"),
            Item(";askdf", "ghaksjglk", "lkasf"),
            Item("laskdfj", "iuatr", "lkasdf"),
            Item("troaiupasd", "puifnb;apawie", "asj;dfp"),
            Item("a;sidug", "pbnauiehrbb", "nkjiaue22"),
            Item("hiubinrasdj", ";nvaspiasurenjf", "joifwepogn"),
            Item("bug", "buzz buzz", "00:00 AM"),
            Item("batman", "vizzzzzzzzzzzzzzzzzzzzzzzzzz", "13:00 PM"),
            Item("Ronaldo", "Siuuuuuuuuuuuuuuuuuuuuuuuuuuu", "19:30 PM")
        )
    }
}