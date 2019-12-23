package iraboo.example.fivesomegolf2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var place = intent.getStringExtra("gplace")
        var date = intent.getStringExtra("gdate")
        var stakes = intent.getStringExtra("gstakes")

        var player1 = intent.getStringExtra("p1name")
        var player2 = intent.getStringExtra("p2name")
        var player3 = intent.getStringExtra("p3name")
        var player4 = intent.getStringExtra("p4name")
        var player5 = intent.getStringExtra("p5name")

        var player1s = intent.getStringExtra("p1score")
        var player2s = intent.getStringExtra("p2score")
        var player3s = intent.getStringExtra("p3score")
        var player4s = intent.getStringExtra("p4score")
        var player5s = intent.getStringExtra("p5score")

        var player1sum = intent.getStringExtra("p1sum")
        var player2sum = intent.getStringExtra("p2sum")
        var player3sum = intent.getStringExtra("p3sum")
        var player4sum = intent.getStringExtra("p4sum")
        var player5sum = intent.getStringExtra("p5sum")

        var player1t = intent.getStringExtra("p1total")
        var player2t = intent.getStringExtra("p2total")
        var player3t = intent.getStringExtra("p3total")
        var player4t = intent.getStringExtra("p4total")
        var player5t = intent.getStringExtra("p5total")

        var stakesmoney :Int = 0

        when (stakes) {
            "5,000원" -> stakesmoney = 5000
            "10,000원" -> stakesmoney = 10000
            "15,000원" -> stakesmoney = 15000
        }

        pEditText.text = place
        dEditText.text = date
        sEditText.text = stakes

        editText301.text = player1
        editText302.text = player2
        editText303.text = player3
        editText304.text = player4
        editText305.text = player5

        editText3191.text = player1s
        editText3192.text = player2s
        editText3193.text = player3s
        editText3194.text = player4s
        editText3195.text = player5s

        editText3201.text = player1sum
        editText3202.text = player2sum
        editText3203.text = player3sum
        editText3204.text = player4sum
        editText3205.text = player5sum

        editText3211.text = player1t
        editText3212.text = player2t
        editText3213.text = player3t
        editText3214.text = player4t
        editText3215.text = player5t

        editText3221.text = (player1t.toInt() * stakesmoney).toString()
        editText3222.text = (player2t.toInt() * stakesmoney).toString()
        editText3223.text = (player3t.toInt() * stakesmoney).toString()
        editText3224.text = (player4t.toInt() * stakesmoney).toString()
        editText3225.text = (player5t.toInt() * stakesmoney).toString()


    }
}
