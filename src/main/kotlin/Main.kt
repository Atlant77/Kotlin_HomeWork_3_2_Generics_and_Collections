fun main() {
    fillDataAutomatic() //Заполняет заметки и комментарии
//
//    println(NotesService.getById(0)) //Показывает заметку по ее id
//
//    NotesService.addComment(
//        0,
//        Comment(2, 3, 45, 43, "EditedComm", 12332233, "guid1", false)
//    )
//
//    println(NotesService.getById(0)) //Показывает заметку по ее id
//    println(NotesService.getComments(0)) //Показывает комментарии к заметке
//
//    println(NotesService.getAll())
//    NotesService.deleteNote(2)
    println(NotesService.toString())
    NotesService.deleteComment(2, 1)
    println(NotesService.toString())
    NotesService.getComments(6)
}

fun fillDataAutomatic() {
    NotesService.addNote(
        Note(
            6,
            3,
            "Title1",
            "Text1",
            155156165,
            15,
            46,
            "www",
            15,
            "wiki",
            13,
            45,
            "3",
            "2",
            null
        )
    )
    NotesService.addNote(
        Note(
            3,
            3,
            "Title2",
            "Text2",
            155156165,
            15,
            46,
            "www",
            15,
            "wiki",
            13,
            45,
            "3",
            "2",
            null
        )
    )
    NotesService.addNote(
        Note(
            7,
            3,
            "Title3",
            "Text3",
            155156165,
            15,
            46,
            "www",
            15,
            "wiki",
            13,
            45,
            "3",
            "2",
            arrayListOf(
                Comment(4, 23, 34, 54, "Привет1", 122433234, "guid", false),
                Comment(5, 23, 34, 54, "Привет2", 122433234, "guid", false),
                Comment(7, 23, 34, 54, "Привет3", 122433234, "guid", false)
            )
        )
    )
    NotesService.addNote(
        Note(
            9,
            3,
            "Title4",
            "Text4",
            155156165,
            15,
            46,
            "www",
            15,
            "wiki",
            13,
            45,
            "3",
            "2",
            null
        )
    )
    println("Данные заполнены автоматически!")
}
