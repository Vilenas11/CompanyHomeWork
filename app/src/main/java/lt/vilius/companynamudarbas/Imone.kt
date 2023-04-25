package lt.vilius.companynamudarbas

import androidx.lifecycle.viewmodel.CreationExtras

class Imone (val companyName : String, val yearOfFoundation : Int) {
    var listOfEmployees: List<Darbuotojas>

    init {
        listOfEmployees = emptyList()
    }

    fun addEmploye(employee: Darbuotojas) {
        listOfEmployees = listOfEmployees.plus(employee)
    }

    fun addListOfStudents(employee: MutableList<Darbuotojas>) {
        listOfEmployees = listOfEmployees.plus(employee)
    }

    fun returnListOfEmployees(): List<Darbuotojas> {
        return listOfEmployees
    }
//    override fun toString(): String = String.format("Vardas: %s, pavarde: %s, asmens kodas: %s, amzius: %s",
//        listOfEmployees.map { it.name }, listOfEmployees.map{it.lastName},
//        listOfEmployees.map{it.idNr}, listOfEmployees.map {it.age })
//}
}

//listOfEmployees.map(Darbuotojas::name), listOfEmployees.map(Darbuotojas::lastName),
//listOfEmployees.map(Darbuotojas::idNr), listOfEmployees.map(Darbuotojas::age))