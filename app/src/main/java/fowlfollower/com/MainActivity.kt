package fowlfollower.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRedirect = findViewById<Button>(R.id.btn_login)
        buttonRedirect.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity (intent)
        }

        val buttonRedirect1 = findViewById<Button>(R.id.button3)
        buttonRedirect1.setOnClickListener {
            val intent = Intent(this, SIgnUp::class.java)
            startActivity (intent)
        }

        val buttonRedirect2 = findViewById<Button>(R.id.button2)
        buttonRedirect2.setOnClickListener {
            val intent = Intent(this, ForgotPassword::class.java)
            startActivity (intent)
        }
    }


}

