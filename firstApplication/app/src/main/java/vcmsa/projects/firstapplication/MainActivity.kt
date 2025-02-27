package vcmsa.projects.firstapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        // find ui components
        val edtBillAmt= findViewById<EditText>(R.id.priceText)

        val edtTipPercent=findViewById<EditText>(R.id.tipText)

        val btnCalc=findViewById<Button>(R.id.button)

        val edtFinPay=findViewById<TextView>( R.id.tipDisp)


        btnCalc.setOnClickListener{

            try{
                val billAmt=edtBillAmt.text.toString().toDouble()

                val percentAmt=edtTipPercent.text.toString().toDouble()
                if(percentAmt<=0 || billAmt<=0){
                    edtFinPay.text=" values cannot be zero";

                }else{

                    val finPay=billAmt+(billAmt*(percentAmt/100))

                    edtFinPay.text="Tip: R${finPay-billAmt}\nTotal: R${String.format("%.2f",finPay)}"
                }

            }catch(e: NumberFormatException){
               edtFinPay.text="invalid values";

            }
          ;
        }




    }
}