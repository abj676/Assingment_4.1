package c.loginscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaration of objects
    EditText email,password;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initilisation of objects
        email=(EditText)findViewById(R.id.email);
        password=(EditText)findViewById(R.id.password);
        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            //onclick method
            @Override
            public void onClick(View view) {
                //strings take for verification
                String emailstr, passwordstr;
                emailstr=email.getText().toString();
                passwordstr=password.getText().toString();

                //Validation of email and password
                if (emailstr.equalsIgnoreCase("Abhishek")&& passwordstr.equalsIgnoreCase("abj")){

                    //Toast on success
                    Toast.makeText(MainActivity.this, "success", Toast.LENGTH_SHORT).show();

                }

                //Toast on faliour
                Toast.makeText(MainActivity.this, "Failour", Toast.LENGTH_SHORT).show();
            }
        });


    }

    //creating menu item
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.appmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id=item.getItemId();
        if (id==R.id.item){
            Toast.makeText(this, "You are on Login Screen", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
