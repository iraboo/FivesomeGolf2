package iraboo.example.fivesomegolf2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_score.*
import android.text.format.DateFormat

class ScoreActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        var place = intent.getStringExtra("place")
        var date = intent.getStringExtra("date")
        var par = intent.getStringExtra("par")
        var player1 = intent.getStringExtra("player1")
        var player2 = intent.getStringExtra("player2")
        var player3 = intent.getStringExtra("player3")
        var player4 = intent.getStringExtra("player4")
        var player5 = intent.getStringExtra("player5")

        placeTextView.text = place
        dateTextView.text = DateFormat.format("yyyy/MM/dd", date.toLong())
        editText00.text = par
        editText01.text = player1
        editText02.text = player2
        editText03.text = player3
        editText04.text = player4
        editText05.text = player5





        var hWeight = IntArray(18,{1})
        var pScoreTable = Array(5, {IntArray(18, {0})})
        var pScore = IntArray(5,{0})
        var pSum =IntArray(5,{0})
        var pBirdie = IntArray(5,{0})
        var total = 0



        editText10.setOnClickListener {


            if(editText10.isChecked) {
                editText10.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[0] = 2 }
            else {
                editText10.setBackgroundResource(R.drawable.customerborder2)
                hWeight[0] = 1 }
        }

        editText20.setOnClickListener {

            if(editText20.isChecked) {
                editText20.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[1] = 2 }
            else {
                editText20.setBackgroundResource(R.drawable.customerborder2)
                hWeight[1] = 1 }
        }

        editText30.setOnClickListener {

            if(editText30.isChecked) {
                editText30.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[2] = 2 }
            else {
                editText30.setBackgroundResource(R.drawable.customerborder2)
                hWeight[2] = 1 }
        }

        editText40.setOnClickListener {

            if(editText40.isChecked) {
                editText40.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[3] = 2 }
            else {
                editText40.setBackgroundResource(R.drawable.customerborder2)
                hWeight[3] = 1 }
        }

        editText50.setOnClickListener {

            if(editText50.isChecked) {
                editText50.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[4] = 2 }
            else {
                editText50.setBackgroundResource(R.drawable.customerborder2)
                hWeight[4] = 1 }
        }

        editText60.setOnClickListener {

            if(editText60.isChecked) {
                editText60.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[5] = 2 }
            else {
                editText60.setBackgroundResource(R.drawable.customerborder2)
                hWeight[5] = 1 }
        }

        editText70.setOnClickListener {

            if(editText70.isChecked) {
                editText70.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[6] = 2 }
            else {
                editText70.setBackgroundResource(R.drawable.customerborder2)
                hWeight[6] = 1 }
        }

        editText80.setOnClickListener {

            if(editText80.isChecked) {
                editText80.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[7] = 2 }
            else {
                editText80.setBackgroundResource(R.drawable.customerborder2)
                hWeight[7] = 1 }
        }

        editText90.setOnClickListener {

            if(editText90.isChecked) {
                editText90.setBackgroundColor(Color.rgb(255,153,153))
                hWeight[8] = 2 }
            else {
                editText90.setBackgroundResource(R.drawable.customerborder2)
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

            pScoreTable[0][0] = editText11.text.toString().toInt()
            pScoreTable[0][1] = editText21.text.toString().toInt()
            pScoreTable[0][2] = editText31.text.toString().toInt()
            pScoreTable[0][3] = editText41.text.toString().toInt()
            pScoreTable[0][4] = editText51.text.toString().toInt()
            pScoreTable[0][5] = editText61.text.toString().toInt()
            pScoreTable[0][6] = editText71.text.toString().toInt()
            pScoreTable[0][7] = editText81.text.toString().toInt()
            pScoreTable[0][8] = editText91.text.toString().toInt()
            pScoreTable[0][9] = editText101.text.toString().toInt()
            pScoreTable[0][10] = editText111.text.toString().toInt()
            pScoreTable[0][11] = editText121.text.toString().toInt()
            pScoreTable[0][12] = editText131.text.toString().toInt()
            pScoreTable[0][13] = editText141.text.toString().toInt()
            pScoreTable[0][14] = editText151.text.toString().toInt()
            pScoreTable[0][15] = editText161.text.toString().toInt()
            pScoreTable[0][16] = editText171.text.toString().toInt()
            pScoreTable[0][17] = editText181.text.toString().toInt()

            pScoreTable[1][0] = editText12.text.toString().toInt()
            pScoreTable[1][1] = editText22.text.toString().toInt()
            pScoreTable[1][2] = editText32.text.toString().toInt()
            pScoreTable[1][3] = editText42.text.toString().toInt()
            pScoreTable[1][4] = editText52.text.toString().toInt()
            pScoreTable[1][5] = editText62.text.toString().toInt()
            pScoreTable[1][6] = editText72.text.toString().toInt()
            pScoreTable[1][7] = editText82.text.toString().toInt()
            pScoreTable[1][8] = editText92.text.toString().toInt()
            pScoreTable[1][9] = editText102.text.toString().toInt()
            pScoreTable[1][10] = editText112.text.toString().toInt()
            pScoreTable[1][11] = editText122.text.toString().toInt()
            pScoreTable[1][12] = editText132.text.toString().toInt()
            pScoreTable[1][13] = editText142.text.toString().toInt()
            pScoreTable[1][14] = editText152.text.toString().toInt()
            pScoreTable[1][15] = editText162.text.toString().toInt()
            pScoreTable[1][16] = editText172.text.toString().toInt()
            pScoreTable[1][17] = editText182.text.toString().toInt()

            pScoreTable[2][0] = editText13.text.toString().toInt()
            pScoreTable[2][1] = editText23.text.toString().toInt()
            pScoreTable[2][2] = editText33.text.toString().toInt()
            pScoreTable[2][3] = editText43.text.toString().toInt()
            pScoreTable[2][4] = editText53.text.toString().toInt()
            pScoreTable[2][5] = editText63.text.toString().toInt()
            pScoreTable[2][6] = editText73.text.toString().toInt()
            pScoreTable[2][7] = editText83.text.toString().toInt()
            pScoreTable[2][8] = editText93.text.toString().toInt()
            pScoreTable[2][9] = editText103.text.toString().toInt()
            pScoreTable[2][10] = editText113.text.toString().toInt()
            pScoreTable[2][11] = editText123.text.toString().toInt()
            pScoreTable[2][12] = editText133.text.toString().toInt()
            pScoreTable[2][13] = editText143.text.toString().toInt()
            pScoreTable[2][14] = editText153.text.toString().toInt()
            pScoreTable[2][15] = editText163.text.toString().toInt()
            pScoreTable[2][16] = editText173.text.toString().toInt()
            pScoreTable[2][17] = editText183.text.toString().toInt()

            pScoreTable[3][0] = editText14.text.toString().toInt()
            pScoreTable[3][1] = editText24.text.toString().toInt()
            pScoreTable[3][2] = editText34.text.toString().toInt()
            pScoreTable[3][3] = editText44.text.toString().toInt()
            pScoreTable[3][4] = editText54.text.toString().toInt()
            pScoreTable[3][5] = editText64.text.toString().toInt()
            pScoreTable[3][6] = editText74.text.toString().toInt()
            pScoreTable[3][7] = editText84.text.toString().toInt()
            pScoreTable[3][8] = editText94.text.toString().toInt()
            pScoreTable[3][9] = editText104.text.toString().toInt()
            pScoreTable[3][10] = editText114.text.toString().toInt()
            pScoreTable[3][11] = editText124.text.toString().toInt()
            pScoreTable[3][12] = editText134.text.toString().toInt()
            pScoreTable[3][13] = editText144.text.toString().toInt()
            pScoreTable[3][14] = editText154.text.toString().toInt()
            pScoreTable[3][15] = editText164.text.toString().toInt()
            pScoreTable[3][16] = editText174.text.toString().toInt()
            pScoreTable[3][17] = editText184.text.toString().toInt()

            pScoreTable[4][0] = editText15.text.toString().toInt()
            pScoreTable[4][1] = editText25.text.toString().toInt()
            pScoreTable[4][2] = editText35.text.toString().toInt()
            pScoreTable[4][3] = editText45.text.toString().toInt()
            pScoreTable[4][4] = editText55.text.toString().toInt()
            pScoreTable[4][5] = editText65.text.toString().toInt()
            pScoreTable[4][6] = editText75.text.toString().toInt()
            pScoreTable[4][7] = editText85.text.toString().toInt()
            pScoreTable[4][8] = editText95.text.toString().toInt()
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
                for(j in pScoreTable[i].indices) {
                    pScore[i] = pScore[i] + pScoreTable[i][j]
                }
            }

            editText191.text = pScore[0].toString()
            editText192.text = pScore[1].toString()
            editText193.text = pScore[2].toString()
            editText194.text = pScore[3].toString()
            editText195.text = pScore[4].toString()
        }

        editText200.setOnClickListener {

            for (i in pBirdie.indices) {
                for (j in pScoreTable[i].indices) {
                    if (pScoreTable[i][j] == -1)
                        pBirdie[i]++
                }
            }

            for (i in pSum.indices) {
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
            pScoreTable[0][0] = editText11.text.toString().toInt()
            pScoreTable[0][1] = editText21.text.toString().toInt()
            pScoreTable[0][2] = editText31.text.toString().toInt()
            pScoreTable[0][3] = editText41.text.toString().toInt()
            pScoreTable[0][4] = editText51.text.toString().toInt()
            pScoreTable[0][5] = editText61.text.toString().toInt()
            pScoreTable[0][6] = editText71.text.toString().toInt()
            pScoreTable[0][7] = editText81.text.toString().toInt()
            pScoreTable[0][8] = editText91.text.toString().toInt()
            pScoreTable[0][9] = editText101.text.toString().toInt()
            pScoreTable[0][10] = editText111.text.toString().toInt()
            pScoreTable[0][11] = editText121.text.toString().toInt()
            pScoreTable[0][12] = editText131.text.toString().toInt()
            pScoreTable[0][13] = editText141.text.toString().toInt()
            pScoreTable[0][14] = editText151.text.toString().toInt()
            pScoreTable[0][15] = editText161.text.toString().toInt()
            pScoreTable[0][16] = editText171.text.toString().toInt()
            pScoreTable[0][17] = editText181.text.toString().toInt()

            pScoreTable[1][0] = editText12.text.toString().toInt()
            pScoreTable[1][1] = editText22.text.toString().toInt()
            pScoreTable[1][2] = editText32.text.toString().toInt()
            pScoreTable[1][3] = editText42.text.toString().toInt()
            pScoreTable[1][4] = editText52.text.toString().toInt()
            pScoreTable[1][5] = editText62.text.toString().toInt()
            pScoreTable[1][6] = editText72.text.toString().toInt()
            pScoreTable[1][7] = editText82.text.toString().toInt()
            pScoreTable[1][8] = editText92.text.toString().toInt()
            pScoreTable[1][9] = editText102.text.toString().toInt()
            pScoreTable[1][10] = editText112.text.toString().toInt()
            pScoreTable[1][11] = editText122.text.toString().toInt()
            pScoreTable[1][12] = editText132.text.toString().toInt()
            pScoreTable[1][13] = editText142.text.toString().toInt()
            pScoreTable[1][14] = editText152.text.toString().toInt()
            pScoreTable[1][15] = editText162.text.toString().toInt()
            pScoreTable[1][16] = editText172.text.toString().toInt()
            pScoreTable[1][17] = editText182.text.toString().toInt()

            pScoreTable[2][0] = editText13.text.toString().toInt()
            pScoreTable[2][1] = editText23.text.toString().toInt()
            pScoreTable[2][2] = editText33.text.toString().toInt()
            pScoreTable[2][3] = editText43.text.toString().toInt()
            pScoreTable[2][4] = editText53.text.toString().toInt()
            pScoreTable[2][5] = editText63.text.toString().toInt()
            pScoreTable[2][6] = editText73.text.toString().toInt()
            pScoreTable[2][7] = editText83.text.toString().toInt()
            pScoreTable[2][8] = editText93.text.toString().toInt()
            pScoreTable[2][9] = editText103.text.toString().toInt()
            pScoreTable[2][10] = editText113.text.toString().toInt()
            pScoreTable[2][11] = editText123.text.toString().toInt()
            pScoreTable[2][12] = editText133.text.toString().toInt()
            pScoreTable[2][13] = editText143.text.toString().toInt()
            pScoreTable[2][14] = editText153.text.toString().toInt()
            pScoreTable[2][15] = editText163.text.toString().toInt()
            pScoreTable[2][16] = editText173.text.toString().toInt()
            pScoreTable[2][17] = editText183.text.toString().toInt()

            pScoreTable[3][0] = editText14.text.toString().toInt()
            pScoreTable[3][1] = editText24.text.toString().toInt()
            pScoreTable[3][2] = editText34.text.toString().toInt()
            pScoreTable[3][3] = editText44.text.toString().toInt()
            pScoreTable[3][4] = editText54.text.toString().toInt()
            pScoreTable[3][5] = editText64.text.toString().toInt()
            pScoreTable[3][6] = editText74.text.toString().toInt()
            pScoreTable[3][7] = editText84.text.toString().toInt()
            pScoreTable[3][8] = editText94.text.toString().toInt()
            pScoreTable[3][9] = editText104.text.toString().toInt()
            pScoreTable[3][10] = editText114.text.toString().toInt()
            pScoreTable[3][11] = editText124.text.toString().toInt()
            pScoreTable[3][12] = editText134.text.toString().toInt()
            pScoreTable[3][13] = editText144.text.toString().toInt()
            pScoreTable[3][14] = editText154.text.toString().toInt()
            pScoreTable[3][15] = editText164.text.toString().toInt()
            pScoreTable[3][16] = editText174.text.toString().toInt()
            pScoreTable[3][17] = editText184.text.toString().toInt()

            pScoreTable[4][0] = editText15.text.toString().toInt()
            pScoreTable[4][1] = editText25.text.toString().toInt()
            pScoreTable[4][2] = editText35.text.toString().toInt()
            pScoreTable[4][3] = editText45.text.toString().toInt()
            pScoreTable[4][4] = editText55.text.toString().toInt()
            pScoreTable[4][5] = editText65.text.toString().toInt()
            pScoreTable[4][6] = editText75.text.toString().toInt()
            pScoreTable[4][7] = editText85.text.toString().toInt()
            pScoreTable[4][8] = editText95.text.toString().toInt()
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
                for (j in pScoreTable[i].indices) {
                    if (pScoreTable[i][j] == -1)
                        pBirdie[i]++
                }
            }

            for (i in pSum.indices) {
                for (j in hWeight.indices)
                    pSum[i] = pSum[i] + hWeight[j]*pScoreTable[i][j]
            }

            editText201.text = (pSum[0] + pBirdie[0]*-2).toString()
            editText202.text = (pSum[1] + pBirdie[1]*-2).toString()
            editText203.text = (pSum[2] + pBirdie[2]*-2).toString()
            editText204.text = (pSum[3] + pBirdie[3]*-2).toString()
            editText205.text = (pSum[4] + pBirdie[4]*-2).toString()


            for (i in pSum.indices) {
                total = total + (pSum[i] + pBirdie[i]*-2)
            }

            editText211.text = (total - 5*(pSum[0]+pBirdie[0]*-2)).toString()
            editText212.text = (total - 5*(pSum[1]+pBirdie[1]*-2)).toString()
            editText213.text = (total - 5*(pSum[2]+pBirdie[2]*-2)).toString()
            editText214.text = (total - 5*(pSum[3]+pBirdie[3]*-2)).toString()
            editText215.text = (total - 5*(pSum[4]+pBirdie[4]*-2)).toString()

        }


    }
}
