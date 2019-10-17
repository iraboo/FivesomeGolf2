package iraboo.example.fivesomegolf2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calendar = Calendar.getInstance()


        calendarView.setOnDateChangeListener { view, year, month, dayOfMonth ->
            calendar.set(Calendar.YEAR, year)
            calendar.set(Calendar.MONTH, month)
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth)
        }

        playFab.setOnClickListener {
            startActivity<ScoreActivity>(
            "place" to placeEditText.text.toString(),
                "date" to calendar.timeInMillis.toString(),
                "par" to parEditText.text.toString(),
                "player1" to p1EditText.text.toString(),
                "player2" to p2EditText.text.toString(),
                "player3" to p3EditText.text.toString(),
                "player4" to p4EditText.text.toString(),
                "player5" to p5EditText.text.toString()
            )
        }
    }
}
