package lt.vilius.companynamudarbas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var darbuotojas1 = Darbuotojas ("Vilius", "Baranauskas", "501060233479")
        var darbuotojas2 = Darbuotojas ("Karin", "Tramplyte", "47708153482")
        var darbuotojas3 = Darbuotojas ("Karolis", "Golcas", "39701259618")
        var darbuotojas4 = Darbuotojas ("Aldona", "Senauskiene", "29907042142")
        var darbuotojas5 = Darbuotojas ("Arnas", "Krastaravicius", "50409027169")

        var company1 = Imone("Shift4", 1984)
        company1.addEmploye(darbuotojas1)
        company1.addEmploye(darbuotojas2)
        company1.addEmploye(darbuotojas3)
        company1.addEmploye(darbuotojas4)
        company1.addEmploye(darbuotojas5)

        var listView : ListView = findViewById(R.id.listViewHere)
        val arrayAdapter: ArrayAdapter<*>
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, company1.returnListOfEmployees())
        listView.adapter = arrayAdapter
    }
}