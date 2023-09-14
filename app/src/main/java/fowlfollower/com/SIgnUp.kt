package fowlfollower.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SIgnUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val buttonRedirect = findViewById<Button>(R.id.button)
        buttonRedirect.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity (intent)
        }
    }
}