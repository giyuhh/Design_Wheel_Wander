package me.tepen.wheelwander

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val username : TextView = findViewById(R.id.usernameEditText);
        val password : TextView = findViewById(R.id.passwordEditText);

        //admin and admin
        val login : MaterialButton = findViewById(R.id.loginButton);

        login.setOnClickListener {
            if (username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
            //correct
                Toast.makeText(this,"Login Successful",Toast.LENGTH_SHORT).show();
        }else
            //incorrect
                Toast.makeText(this,"The email address or password you entered is incorrect. Please try again. ",Toast.LENGTH_SHORT).show();

        }


    }
}