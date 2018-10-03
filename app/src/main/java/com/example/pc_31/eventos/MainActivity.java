package com.example.pc_31.eventos;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Declaración--------------------------------
    //ConstraintLayout clPrincipal;
    //ImageView   ivStarWars;
    //ListView    lvAlumnos;
    ImageView   ivBebida;
    ImageView   ivFresas;
    ImageView   ivGalleta;
    ImageView   ivGelatina;
    ImageView   ivNugget;
    ImageView   ivSushi;

    TextView   tvBebida;
    TextView   tvFresas;
    TextView   tvGalleta;
    TextView   tvGelatina;
    TextView   tvNugget;
    TextView   tvSushi;



    RatingBar   rbCalifica;

    SmsManager sms;

    Button  botonSms;


    //Variables----------------------------------
    /*String[] listaAlumnos = {"Edgar",
            "Alexis",
            "Ernesto",
            "Gustavo",
            "Oscar",
            "Eduardo",
            "Carlos",
            "Abby",
            "Miguel",
            "Juan",
            "Jose Luis"
    };
    */
    int contBebida;
    int contFresas;
    int contGalleta;
    int contGelatina;
    int contNugget;
    int contSushi;

    int contStar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        
        //Enlaces---------------------------------------
        //clPrincipal = (ConstraintLayout)findViewById(R.id.clPrincipal);
        //ivStarWars  = (ImageView)findViewById(R.id.ivStarWars);
        //lvAlumnos =  (ListView)findViewById(R.id.lvAlumnos);
        ivBebida = (ImageView)findViewById(R.id.ivBebida);
        ivFresas = (ImageView)findViewById(R.id.ivFresas);
        ivGalleta = (ImageView)findViewById(R.id.ivGalleta);
        ivGelatina = (ImageView)findViewById(R.id.ivGelatina);
        ivNugget = (ImageView)findViewById(R.id.ivNugget);
        ivSushi = (ImageView)findViewById(R.id.ivSushi);

        tvBebida = (TextView)findViewById(R.id.tvBebida);
        tvFresas = (TextView)findViewById(R.id.tvFresas);
        tvGalleta = (TextView)findViewById(R.id.tvGalleta);
        tvGelatina = (TextView)findViewById(R.id.tvGelatina);
        tvNugget = (TextView)findViewById(R.id.tvNugget);
        tvSushi = (TextView)findViewById(R.id.tvSushi);

        rbCalifica = (RatingBar)findViewById(R.id.rbCalifica);

        final SmsManager sms =SmsManager.getDefault();

        botonSms = (Button)findViewById(R.id.botonSms);



        //Funcionalidad------------------------------------
        /*
        clPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clPrincipal.setBackgroundColor(Color.BLUE);
            }
        });

        //Para cuando es largo el click
        clPrincipal.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                clPrincipal.setBackgroundColor(Color.MAGENTA);
                return true;
            }
        });

        ivStarWars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clPrincipal.setBackgroundColor(Color.YELLOW);
            }
        });

        ivStarWars.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                clPrincipal.setBackgroundColor(Color.GREEN);

                return true;
            }
        });
        */

        //Segundo Programa-----------
        /*
        //Mostrar Lista
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,listaAlumnos);

        lvAlumnos.setAdapter(adapter);

        //tomar valor lista un item dar el valor
        lvAlumnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(),
                        "Capturaste al Pokemon " + parent.getItemAtPosition(position),
                        Toast.LENGTH_SHORT).show();
            }
        });

        */

        //Tercer Programa **********************************

        //--------Bebida
        ivBebida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contBebida++;
                tvBebida.append("" + contBebida);
            }
        });

        ivBebida.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                contBebida--;
                tvBebida.append(" " + contBebida);
                return true;
            }
        });


        //--------Fresas
        ivFresas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contFresas++;
                tvFresas.append(""+ contFresas);
            }
        });

        ivFresas.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                contFresas--;
                tvFresas.append(""+ contFresas);
                return true;
            }
        });

        //--------Galleta
        ivGalleta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contGalleta++;
                tvGalleta.append(""+contGalleta);
            }
        });

        ivGalleta.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                contGalleta--;
                tvGalleta.append(""+contGalleta);
                return true;
            }
        });

        //--------Gelatina
        ivGelatina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contGelatina++;
                tvGelatina.append(""+contGelatina);
            }
        });

        ivGelatina.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                contGelatina--;
                tvGelatina.append(""+contGelatina);
                return true;
            }
        });

        //--------Nugget
        ivNugget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contNugget++;
                tvNugget.append(""+ contNugget);
            }
        });

        ivNugget.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                contNugget--;
                tvNugget.append(""+ contNugget);
                return true;
            }
        });

        //--------Sushi
        ivSushi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contSushi++;
                tvSushi.append(""+ contSushi);
            }
        });

        ivSushi.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                contSushi--;
                tvSushi.append(""+ contSushi);
                return true;
            }
        });

        //---------Contador Estrellas
        contStar = rbCalifica.getNumStars();

        botonSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sms.sendTextMessage("5524483038",null,
                        "Bebida: "+ contBebida +
                                ", Fresas: "+ contFresas +
                                ", Galleta: " + contGalleta +
                                ", Gelatina: " + contGelatina+
                                ", Nugget: "+ contNugget +
                                ", Sushi: "+ contSushi +
                                ", Estrellas: " + contStar,
                        null,null );
            }
        });




    }
}
