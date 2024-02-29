package iut.saobane.coco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// MainActivity.kt
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialisation des éléments d'interface utilisateur
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)
        btnLogin = findViewById(R.id.btnLogin)

        // Ajout d'un écouteur de clic au bouton de connexion
        btnLogin.setOnClickListener {
            login()
        }
    }

    private fun login() {
        val username = etUsername.text.toString()
        val password = etPassword.text.toString()

        // Ajoutez ici la logique de connexion
        // Comparez les valeurs saisies avec les informations d'identification correctes
        // et affichez un message approprié en cas de succès ou d'échec de la connexion
    }
}
