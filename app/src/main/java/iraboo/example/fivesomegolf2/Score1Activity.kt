package iraboo.example.fivesomegolf2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import kotlinx.android.synthetic.main.activity_score1.*
import android.text.format.DateFormat
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class Score1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score1)

        val place = intent.getStringExtra("place")
        val date = intent.getStringExtra("date")
        val par = intent.getStringExtra("par")
        val player1 = intent.getStringExtra("player1")
        val player2 = intent.getStringExtra("player2")
        val player3 = intent.getStringExtra("player3")
        val player4 = intent.getStringExtra("player4")
        val player5 = intent.getStringExtra("player5")
        val stakes = intent.getStringExtra("stakes")
        var stakesmoney = 0

        when (stakes) {
            "5,000원" -> stakesmoney = 5000
            "10,000원" -> stakesmoney = 10000
            "15,000원" -> stakesmoney = 15000
        }

        placeTextView.text = place
        dateTextView.text = DateFormat.format("yyyy/MM/dd", date.toLong())
        stakeTextView.text = stakes+"짜리"
        editText000.text = par
        editText001.text = player1
        editText002.text = player2
        editText003.text = player3
        editText004.text = player4
        editText005.text = player5

        var hWeight = IntArray(18,{1})
        var pScoreTable = Array(5, {IntArray(18, {0})})
        var pScore = IntArray(5,{0})
        var pSum =IntArray(5,{0})
        var pBirdie = IntArray(5,{0})
        var total = 0

        editText010.setOnClickListener {

            if(editText010.isChecked) {
                editText010.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[0] = 2 }
            else {
                editText010.setBackgroundResource(R.drawable.customerborder2)
                hWeight[0] = 1 }
        }

        editText020.setOnClickListener {

            if(editText020.isChecked) {
                editText020.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[1] = 2 }
            else {
                editText020.setBackgroundResource(R.drawable.customerborder2)
                hWeight[1] = 1 }
        }

        editText030.setOnClickListener {

            if(editText030.isChecked) {
                editText030.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[2] = 2 }
            else {
                editText030.setBackgroundResource(R.drawable.customerborder2)
                hWeight[2] = 1 }
        }

        editText040.setOnClickListener {

            if(editText040.isChecked) {
                editText040.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[3] = 2 }
            else {
                editText040.setBackgroundResource(R.drawable.customerborder2)
                hWeight[3] = 1 }
        }

        editText050.setOnClickListener {

            if(editText050.isChecked) {
                editText050.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[4] = 2 }
            else {
                editText050.setBackgroundResource(R.drawable.customerborder2)
                hWeight[4] = 1 }
        }

        editText060.setOnClickListener {

            if(editText060.isChecked) {
                editText060.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[5] = 2 }
            else {
                editText060.setBackgroundResource(R.drawable.customerborder2)
                hWeight[5] = 1 }
        }

        editText070.setOnClickListener {

            if(editText070.isChecked) {
                editText070.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[6] = 2 }
            else {
                editText070.setBackgroundResource(R.drawable.customerborder2)
                hWeight[6] = 1 }
        }

        editText080.setOnClickListener {

            if(editText080.isChecked) {
                editText080.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[7] = 2 }
            else {
                editText080.setBackgroundResource(R.drawable.customerborder2)
                hWeight[7] = 1 }
        }

        editText090.setOnClickListener {

            if(editText090.isChecked) {
                editText090.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[8] = 2 }
            else {
                editText090.setBackgroundResource(R.drawable.customerborder2)
                hWeight[8] = 1 }
        }

        editText100.setOnClickListener {

            if(editText100.isChecked) {
                editText100.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[9] = 2 }
            else {
                editText100.setBackgroundResource(R.drawable.customerborder2)
                hWeight[9] = 1 }
        }

        editText110.setOnClickListener {

            if(editText110.isChecked) {
                editText110.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[10] = 2 }
            else {
                editText110.setBackgroundResource(R.drawable.customerborder2)
                hWeight[10] = 1 }
        }

        editText120.setOnClickListener {

            if(editText120.isChecked) {
                editText120.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[11] = 2 }
            else {
                editText120.setBackgroundResource(R.drawable.customerborder2)
                hWeight[11] = 1 }
        }

        editText130.setOnClickListener {

            if(editText130.isChecked) {
                editText130.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[12] = 2 }
            else {
                editText130.setBackgroundResource(R.drawable.customerborder2)
                hWeight[12] = 1 }
        }

        editText140.setOnClickListener {

            if(editText140.isChecked) {
                editText140.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[13] = 2 }
            else {
                editText140.setBackgroundResource(R.drawable.customerborder2)
                hWeight[13] = 1 }
        }

        editText150.setOnClickListener {

            if(editText150.isChecked) {
                editText150.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[14] = 2 }
            else {
                editText150.setBackgroundResource(R.drawable.customerborder2)
                hWeight[14] = 1 }
        }

        editText160.setOnClickListener {

            if(editText160.isChecked) {
                editText160.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[15] = 2 }
            else {
                editText160.setBackgroundResource(R.drawable.customerborder2)
                hWeight[15] = 1 }
        }

        editText170.setOnClickListener {

            if(editText170.isChecked) {
                editText170.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[16] = 2 }
            else {
                editText170.setBackgroundResource(R.drawable.customerborder2)
                hWeight[16] = 1 }
        }

        editText180.setOnClickListener {

            if(editText180.isChecked) {
                editText180.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[17] = 2 }
            else {
                editText180.setBackgroundResource(R.drawable.customerborder2)
                hWeight[17] = 1 }
        }

        /*
        editText190.setOnClickListener {
            pScoreTable[0][0] = editText011.text.toString().toInt()
            pScoreTable[0][1] = editText021.text.toString().toInt()
            pScoreTable[0][2] = editText031.text.toString().toInt()
            pScoreTable[0][3] = editText041.text.toString().toInt()
            pScoreTable[0][4] = editText051.text.toString().toInt()
            pScoreTable[0][5] = editText061.text.toString().toInt()
            pScoreTable[0][6] = editText071.text.toString().toInt()
            pScoreTable[0][7] = editText081.text.toString().toInt()
            pScoreTable[0][8] = editText091.text.toString().toInt()
            pScoreTable[0][9] = editText101.text.toString().toInt()
            pScoreTable[0][10] = editText111.text.toString().toInt()
            pScoreTable[0][11] = editText121.text.toString().toInt()
            pScoreTable[0][12] = editText131.text.toString().toInt()
            pScoreTable[0][13] = editText141.text.toString().toInt()
            pScoreTable[0][14] = editText151.text.toString().toInt()
            pScoreTable[0][15] = editText161.text.toString().toInt()
            pScoreTable[0][16] = editText171.text.toString().toInt()
            pScoreTable[0][17] = editText181.text.toString().toInt()

            pScoreTable[1][0] = editText012.text.toString().toInt()
            pScoreTable[1][1] = editText022.text.toString().toInt()
            pScoreTable[1][2] = editText032.text.toString().toInt()
            pScoreTable[1][3] = editText042.text.toString().toInt()
            pScoreTable[1][4] = editText052.text.toString().toInt()
            pScoreTable[1][5] = editText062.text.toString().toInt()
            pScoreTable[1][6] = editText072.text.toString().toInt()
            pScoreTable[1][7] = editText082.text.toString().toInt()
            pScoreTable[1][8] = editText092.text.toString().toInt()
            pScoreTable[1][9] = editText102.text.toString().toInt()
            pScoreTable[1][10] = editText112.text.toString().toInt()
            pScoreTable[1][11] = editText122.text.toString().toInt()
            pScoreTable[1][12] = editText132.text.toString().toInt()
            pScoreTable[1][13] = editText142.text.toString().toInt()
            pScoreTable[1][14] = editText152.text.toString().toInt()
            pScoreTable[1][15] = editText162.text.toString().toInt()
            pScoreTable[1][16] = editText172.text.toString().toInt()
            pScoreTable[1][17] = editText182.text.toString().toInt()

            pScoreTable[2][0] = editText013.text.toString().toInt()
            pScoreTable[2][1] = editText023.text.toString().toInt()
            pScoreTable[2][2] = editText033.text.toString().toInt()
            pScoreTable[2][3] = editText043.text.toString().toInt()
            pScoreTable[2][4] = editText053.text.toString().toInt()
            pScoreTable[2][5] = editText063.text.toString().toInt()
            pScoreTable[2][6] = editText073.text.toString().toInt()
            pScoreTable[2][7] = editText083.text.toString().toInt()
            pScoreTable[2][8] = editText093.text.toString().toInt()
            pScoreTable[2][9] = editText103.text.toString().toInt()
            pScoreTable[2][10] = editText113.text.toString().toInt()
            pScoreTable[2][11] = editText123.text.toString().toInt()
            pScoreTable[2][12] = editText133.text.toString().toInt()
            pScoreTable[2][13] = editText143.text.toString().toInt()
            pScoreTable[2][14] = editText153.text.toString().toInt()
            pScoreTable[2][15] = editText163.text.toString().toInt()
            pScoreTable[2][16] = editText173.text.toString().toInt()
            pScoreTable[2][17] = editText183.text.toString().toInt()

            pScoreTable[3][0] = editText014.text.toString().toInt()
            pScoreTable[3][1] = editText024.text.toString().toInt()
            pScoreTable[3][2] = editText034.text.toString().toInt()
            pScoreTable[3][3] = editText044.text.toString().toInt()
            pScoreTable[3][4] = editText054.text.toString().toInt()
            pScoreTable[3][5] = editText064.text.toString().toInt()
            pScoreTable[3][6] = editText074.text.toString().toInt()
            pScoreTable[3][7] = editText084.text.toString().toInt()
            pScoreTable[3][8] = editText094.text.toString().toInt()
            pScoreTable[3][9] = editText104.text.toString().toInt()
            pScoreTable[3][10] = editText114.text.toString().toInt()
            pScoreTable[3][11] = editText124.text.toString().toInt()
            pScoreTable[3][12] = editText134.text.toString().toInt()
            pScoreTable[3][13] = editText144.text.toString().toInt()
            pScoreTable[3][14] = editText154.text.toString().toInt()
            pScoreTable[3][15] = editText164.text.toString().toInt()
            pScoreTable[3][16] = editText174.text.toString().toInt()
            pScoreTable[3][17] = editText184.text.toString().toInt()

            pScoreTable[4][0] = editText015.text.toString().toInt()
            pScoreTable[4][1] = editText025.text.toString().toInt()
            pScoreTable[4][2] = editText035.text.toString().toInt()
            pScoreTable[4][3] = editText045.text.toString().toInt()
            pScoreTable[4][4] = editText055.text.toString().toInt()
            pScoreTable[4][5] = editText065.text.toString().toInt()
            pScoreTable[4][6] = editText075.text.toString().toInt()
            pScoreTable[4][7] = editText085.text.toString().toInt()
            pScoreTable[4][8] = editText095.text.toString().toInt()
            pScoreTable[4][9] = editText105.text.toString().toInt()
            pScoreTable[4][10] = editText115.text.toString().toInt()
            pScoreTable[4][11] = editText125.text.toString().toInt()
            pScoreTable[4][12] = editText135.text.toString().toInt()
            pScoreTable[4][13] = editText145.text.toString().toInt()
            pScoreTable[4][14] = editText155.text.toString().toInt()
            pScoreTable[4][15] = editText165.text.toString().toInt()
            pScoreTable[4][16] = editText175.text.toString().toInt()
            pScoreTable[4][17] = editText185.text.toString().toInt()

            for(i in pScoreTable.indices) {
                pScore[i] = 0
                for(j in pScoreTable[i].indices) {
                    pScore[i] = pScore[i] + pScoreTable[i][j]
                }
            }

            editText191.text = (pScore[0] + par.toInt()).toString()
            editText192.text = (pScore[1] + par.toInt()).toString()
            editText193.text = (pScore[2] + par.toInt()).toString()
            editText194.text = (pScore[3] + par.toInt()).toString()
            editText195.text = (pScore[4] + par.toInt()).toString()
        }

        editText200.setOnClickListener {
            for (i in pBirdie.indices) {
                pBirdie[i] = 0
                for (j in pScoreTable[i].indices) {
                    if (pScoreTable[i][j] == -1)
                        pBirdie[i]++
                }
            }

            for (i in pSum.indices) {
                pSum[i] = 0
                for (j in hWeight.indices)
                    pSum[i] = pSum[i] + hWeight[j]*pScoreTable[i][j]
            }

            editText201.text = (pSum[0] + pBirdie[0]*-2).toString()
            editText202.text = (pSum[1] + pBirdie[1]*-2).toString()
            editText203.text = (pSum[2] + pBirdie[2]*-2).toString()
            editText204.text = (pSum[3] + pBirdie[3]*-2).toString()
            editText205.text = (pSum[4] + pBirdie[4]*-2).toString()
        }

        editText210.setOnClickListener {
            total = 0

            for (i in pSum.indices) {
                total = total + (pSum[i] + pBirdie[i]*-2)
            }

            editText211.text = (total - 5*(pSum[0]+pBirdie[0]*-2)).toString()
            editText212.text = (total - 5*(pSum[1]+pBirdie[1]*-2)).toString()
            editText213.text = (total - 5*(pSum[2]+pBirdie[2]*-2)).toString()
            editText214.text = (total - 5*(pSum[3]+pBirdie[3]*-2)).toString()
            editText215.text = (total - 5*(pSum[4]+pBirdie[4]*-2)).toString()
        }
        */

        resultButton.setOnClickListener {
            pScoreTable[0][0] = editText011.text.toString().toInt()
            pScoreTable[0][1] = editText021.text.toString().toInt()
            pScoreTable[0][2] = editText031.text.toString().toInt()
            pScoreTable[0][3] = editText041.text.toString().toInt()
            pScoreTable[0][4] = editText051.text.toString().toInt()
            pScoreTable[0][5] = editText061.text.toString().toInt()
            pScoreTable[0][6] = editText071.text.toString().toInt()
            pScoreTable[0][7] = editText081.text.toString().toInt()
            pScoreTable[0][8] = editText091.text.toString().toInt()
            pScoreTable[0][9] = editText101.text.toString().toInt()
            pScoreTable[0][10] = editText111.text.toString().toInt()
            pScoreTable[0][11] = editText121.text.toString().toInt()
            pScoreTable[0][12] = editText131.text.toString().toInt()
            pScoreTable[0][13] = editText141.text.toString().toInt()
            pScoreTable[0][14] = editText151.text.toString().toInt()
            pScoreTable[0][15] = editText161.text.toString().toInt()
            pScoreTable[0][16] = editText171.text.toString().toInt()
            pScoreTable[0][17] = editText181.text.toString().toInt()

            pScoreTable[1][0] = editText012.text.toString().toInt()
            pScoreTable[1][1] = editText022.text.toString().toInt()
            pScoreTable[1][2] = editText032.text.toString().toInt()
            pScoreTable[1][3] = editText042.text.toString().toInt()
            pScoreTable[1][4] = editText052.text.toString().toInt()
            pScoreTable[1][5] = editText062.text.toString().toInt()
            pScoreTable[1][6] = editText072.text.toString().toInt()
            pScoreTable[1][7] = editText082.text.toString().toInt()
            pScoreTable[1][8] = editText092.text.toString().toInt()
            pScoreTable[1][9] = editText102.text.toString().toInt()
            pScoreTable[1][10] = editText112.text.toString().toInt()
            pScoreTable[1][11] = editText122.text.toString().toInt()
            pScoreTable[1][12] = editText132.text.toString().toInt()
            pScoreTable[1][13] = editText142.text.toString().toInt()
            pScoreTable[1][14] = editText152.text.toString().toInt()
            pScoreTable[1][15] = editText162.text.toString().toInt()
            pScoreTable[1][16] = editText172.text.toString().toInt()
            pScoreTable[1][17] = editText182.text.toString().toInt()

            pScoreTable[2][0] = editText013.text.toString().toInt()
            pScoreTable[2][1] = editText023.text.toString().toInt()
            pScoreTable[2][2] = editText033.text.toString().toInt()
            pScoreTable[2][3] = editText043.text.toString().toInt()
            pScoreTable[2][4] = editText053.text.toString().toInt()
            pScoreTable[2][5] = editText063.text.toString().toInt()
            pScoreTable[2][6] = editText073.text.toString().toInt()
            pScoreTable[2][7] = editText083.text.toString().toInt()
            pScoreTable[2][8] = editText093.text.toString().toInt()
            pScoreTable[2][9] = editText103.text.toString().toInt()
            pScoreTable[2][10] = editText113.text.toString().toInt()
            pScoreTable[2][11] = editText123.text.toString().toInt()
            pScoreTable[2][12] = editText133.text.toString().toInt()
            pScoreTable[2][13] = editText143.text.toString().toInt()
            pScoreTable[2][14] = editText153.text.toString().toInt()
            pScoreTable[2][15] = editText163.text.toString().toInt()
            pScoreTable[2][16] = editText173.text.toString().toInt()
            pScoreTable[2][17] = editText183.text.toString().toInt()

            pScoreTable[3][0] = editText014.text.toString().toInt()
            pScoreTable[3][1] = editText024.text.toString().toInt()
            pScoreTable[3][2] = editText034.text.toString().toInt()
            pScoreTable[3][3] = editText044.text.toString().toInt()
            pScoreTable[3][4] = editText054.text.toString().toInt()
            pScoreTable[3][5] = editText064.text.toString().toInt()
            pScoreTable[3][6] = editText074.text.toString().toInt()
            pScoreTable[3][7] = editText084.text.toString().toInt()
            pScoreTable[3][8] = editText094.text.toString().toInt()
            pScoreTable[3][9] = editText104.text.toString().toInt()
            pScoreTable[3][10] = editText114.text.toString().toInt()
            pScoreTable[3][11] = editText124.text.toString().toInt()
            pScoreTable[3][12] = editText134.text.toString().toInt()
            pScoreTable[3][13] = editText144.text.toString().toInt()
            pScoreTable[3][14] = editText154.text.toString().toInt()
            pScoreTable[3][15] = editText164.text.toString().toInt()
            pScoreTable[3][16] = editText174.text.toString().toInt()
            pScoreTable[3][17] = editText184.text.toString().toInt()

            pScoreTable[4][0] = editText015.text.toString().toInt()
            pScoreTable[4][1] = editText025.text.toString().toInt()
            pScoreTable[4][2] = editText035.text.toString().toInt()
            pScoreTable[4][3] = editText045.text.toString().toInt()
            pScoreTable[4][4] = editText055.text.toString().toInt()
            pScoreTable[4][5] = editText065.text.toString().toInt()
            pScoreTable[4][6] = editText075.text.toString().toInt()
            pScoreTable[4][7] = editText085.text.toString().toInt()
            pScoreTable[4][8] = editText095.text.toString().toInt()
            pScoreTable[4][9] = editText105.text.toString().toInt()
            pScoreTable[4][10] = editText115.text.toString().toInt()
            pScoreTable[4][11] = editText125.text.toString().toInt()
            pScoreTable[4][12] = editText135.text.toString().toInt()
            pScoreTable[4][13] = editText145.text.toString().toInt()
            pScoreTable[4][14] = editText155.text.toString().toInt()
            pScoreTable[4][15] = editText165.text.toString().toInt()
            pScoreTable[4][16] = editText175.text.toString().toInt()
            pScoreTable[4][17] = editText185.text.toString().toInt()


            for(i in pScoreTable.indices) {
                pScore[i] = 0
                for(j in pScoreTable[i].indices) {
                    pScore[i] = pScore[i] + pScoreTable[i][j]
                }
            }

            editText191.text = (pScore[0] + par.toInt()).toString()
            editText192.text = (pScore[1] + par.toInt()).toString()
            editText193.text = (pScore[2] + par.toInt()).toString()
            editText194.text = (pScore[3] + par.toInt()).toString()
            editText195.text = (pScore[4] + par.toInt()).toString()

            for (i in pBirdie.indices) {
                pBirdie[i] = 0
                for (j in pScoreTable[i].indices) {
                    if (pScoreTable[i][j] == -1)
                        pBirdie[i]++
                }
            }

            for (i in pSum.indices) {
                pSum[i] = 0
                for (j in hWeight.indices)
                    pSum[i] = pSum[i] + hWeight[j]*pScoreTable[i][j]
            }

            editText201.text = (pSum[0] + pBirdie[0]*-2).toString()
            editText202.text = (pSum[1] + pBirdie[1]*-2).toString()
            editText203.text = (pSum[2] + pBirdie[2]*-2).toString()
            editText204.text = (pSum[3] + pBirdie[3]*-2).toString()
            editText205.text = (pSum[4] + pBirdie[4]*-2).toString()

            total = 0
            for (i in pSum.indices) {
                total = total + (pSum[i] + pBirdie[i]*-2)
            }

            editText211.text = (total - 5*(pSum[0]+pBirdie[0]*-2)).toString()
            editText212.text = (total - 5*(pSum[1]+pBirdie[1]*-2)).toString()
            editText213.text = (total - 5*(pSum[2]+pBirdie[2]*-2)).toString()
            editText214.text = (total - 5*(pSum[3]+pBirdie[3]*-2)).toString()
            editText215.text = (total - 5*(pSum[4]+pBirdie[4]*-2)).toString()

            editText221.text = (editText211.text.toString().toInt() * stakesmoney).toString()
            editText222.text = (editText212.text.toString().toInt() * stakesmoney).toString()
            editText223.text = (editText213.text.toString().toInt() * stakesmoney).toString()
            editText224.text = (editText214.text.toString().toInt() * stakesmoney).toString()
            editText225.text = (editText215.text.toString().toInt() * stakesmoney).toString()
        }

        /*
        FAB1.setOnClickListener {
            startActivity<ResultActivity>(

                "gplace" to placeTextView.text.toString(),
                "gdate" to dateTextView.text.toString(),
                "gstakes" to stakes,

                "p1name" to editText01.text.toString(),
                "p2name" to editText02.text.toString(),
                "p3name" to editText03.text.toString(),
                "p4name" to editText04.text.toString(),
                "p5name" to editText05.text.toString(),

                "p1score" to editText191.text.toString(),
                "p2score" to editText192.text.toString(),
                "p3score" to editText193.text.toString(),
                "p4score" to editText194.text.toString(),
                "p5score" to editText195.text.toString(),

                "p1sum" to editText201.text.toString(),
                "p2sum" to editText202.text.toString(),
                "p3sum" to editText203.text.toString(),
                "p4sum" to editText204.text.toString(),
                "p5sum" to editText205.text.toString(),

                "p1total" to editText211.text.toString(),
                "p2total" to editText212.text.toString(),
                "p3total" to editText213.text.toString(),
                "p4total" to editText214.text.toString(),
                "p5total" to editText215.text.toString()
            )
        }
        */
    }
}
