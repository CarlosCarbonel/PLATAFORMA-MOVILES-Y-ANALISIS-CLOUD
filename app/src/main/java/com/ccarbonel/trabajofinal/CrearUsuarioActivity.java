package com.ccarbonel.trabajofinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.ccarbonel.trabajofinal.DAO.DAOtipousuario;
import com.ccarbonel.trabajofinal.entidades.TipoUsuario;
import com.ccarbonel.trabajofinal.entidades.Usuarios;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.libraries.places.api.net.PlacesClient;
import java.util.ArrayList;
import java.util.List;

public class CrearUsuarioActivity extends AppCompatActivity  {
    // Tomar foto para registro
    private ImageButton btnImagen;
    private ImageView fotousuario;

    private boolean imagen1Visible = true;

    private Button btncusuario;

    Spinner spTipoUsuario;
    DAOtipousuario daotipousuario = new DAOtipousuario(this);
    List<TipoUsuario> listaTipoUsuario = new ArrayList<>();
    Usuarios usuarios;
    EditText edcuenta,edpass,ednombres,edapellidos,eddni,eddistrito,eddireccion;


    // Google maps
    private GoogleMap mMap;
    float latitud,longitud;
    private PlacesClient placesClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crearusuario);
        tomaFotoUsuario();
        //guardarUsuario();
        asignarReferencias();
        cargarTipoUsuario();
    }


    private void asignarReferencias(){

        spTipoUsuario=findViewById(R.id.spTipoUsuario);
        edcuenta=findViewById(R.id.edcuenta);
        edpass=findViewById(R.id.edpass);
        ednombres=findViewById(R.id.ednombres);
        edapellidos=findViewById(R.id.edapellidos);
        eddni=findViewById(R.id.eddni);
        eddistrito=findViewById(R.id.eddistrito);
        eddireccion=findViewById(R.id.eddireccion);
        btncusuario = findViewById(R.id.btncusuario);
        btncusuario.setOnClickListener(v -> {
            capturarDatos();
        });

        }

        private boolean capturarDatos(){
            TipoUsuario tpusuario = (TipoUsuario) spTipoUsuario.getSelectedItem();
            //if(tpusuario.getTipo().equals("VENDEDOR")){
              //  Toast.makeText(this,"Abrir actividad de mate",Toast.LENGTH_SHORT).show();
            //}
            String cuenta= edcuenta.getText().toString();
            String pass= edpass.getText().toString();
            String nombres=ednombres.getText().toString();
            String apellidos=edapellidos.getText().toString();
            String dni =eddni.getText().toString();
            String distrito=eddistrito.getText().toString();
            String direccion=eddireccion.getText().toString();

            //validamos datos
            boolean valida=true;
            if(cuenta.equals("")){
                edcuenta.setError("Crear Usuario es obligatorio");
                valida=false;
            }
            if(pass.equals("")){
                edpass.setError("Crear contraseña es obligatorio");
                valida=false;
            }
            if(nombres.equals("")){
                ednombres.setError("Tu nombre o nombres es obligatorio");
                valida=false;
            }
            if(apellidos.equals("")){
                edapellidos.setError("Tu apellido o apellidos es obligatorio");
                valida=false;
            }
            if(dni.equals("")){
                eddni.setError("Tu dni es obligatorio");
                valida=false;
            }
            if(distrito.equals("")){
                eddistrito.setError("Tu distrito es obligatorio");
                valida=false;
            }
            if(direccion.equals("")){
                eddireccion.setError("Tu dirección es obligatorio");
                valida=false;
            }else{

                    btncusuario.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent intent = new Intent(CrearUsuarioActivity.this, UsuarioActivity.class);
                            startActivity(intent);

                        }
                    });
            }
            if(valida){
                usuarios= new Usuarios(nombres,apellidos,tpusuario.getId(),Integer.parseInt(dni),distrito,direccion);
            }
            return valida;
        }

        private void cargarTipoUsuario(){
            daotipousuario.abrirBD();
            listaTipoUsuario= daotipousuario.obtenerTipoUsuario();
            ArrayAdapter<TipoUsuario> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item,listaTipoUsuario);
            adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spTipoUsuario.setAdapter(adaptador);
        }

    private void tomaFotoUsuario(){
        fotousuario = findViewById(R.id.fotousuario);
        btnImagen = findViewById(R.id.btncamara);
        btnImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Acción a realizar cuando se hace clic en la imagen
                Toast.makeText(CrearUsuarioActivity.this, "Haz hecho clic en la imagen", Toast.LENGTH_SHORT).show();

                if ((imagen1Visible)) {
                    fotousuario.setImageResource(R.drawable.dextercalato2);
                    imagen1Visible = false;
                }
            }
        });
    }



}

