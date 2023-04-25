package lt.vilius.companynamudarbas

import android.util.Log
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.Period

class Darbuotojas(val name : String, val lastName : String,val idNr : String) {
    var position : String = ""
    var yearsOfExperience : Int = 0
    var age: Int = 0
        private set

    init {
        countAge()
        logEverything()
    }


    private fun countAge() {
        var dateOfBirth : String = ""
        var birthYear : String = ""
        var dateMonth : String = ""
        var dateDay : String = ""

        if (idNr.first() == '3' || idNr.first() == '4') {
            var temp1 = StringBuilder().append(idNr.get(1)).append(idNr.get(2)).toString()
            var temp = 1900 + temp1.toInt()
            birthYear = temp.toString()
        }
        else if(idNr.first() == '1' || idNr.first() == '2'){
            var temp1 = StringBuilder().append(idNr.get(1)).append(idNr.get(2)).toString()
            var temp = 1800 + temp1.toInt()
            birthYear = temp.toString()
        }
        else if(idNr.first() == '5' || idNr.first() == '6'){
            var temp1 = StringBuilder().append(idNr.get(1)).append(idNr.get(2)).toString()
            var temp = 2000 + temp1.toInt()
            birthYear = temp.toString()
        }
        dateMonth = StringBuilder().append(idNr.get(3)).append(idNr.get(4)).toString()
        dateDay = StringBuilder().append(idNr.get(5)).append(idNr.get(6)).toString()

        dateOfBirth = birthYear + '-' + dateMonth + '-' + dateDay

        var currentday = LocalDate.now()
        var period = LocalDate.parse(dateOfBirth)
        this.age = Period.between(period, currentday).years
    }
    private fun logEverything() {
        Log.i("Tag", "Name: $name, Last name: $lastName, ID: $idNr, age: $age")
    }
    override fun toString(): String {
        return "Vardas:$name , pavarde: $lastName, asmens kodas: $idNr, amzius: $age"
    }
}