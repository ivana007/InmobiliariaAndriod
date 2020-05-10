package com.example.inmobiliaria;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PerfilFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PerfilFragment extends Fragment {
    private EditText edDni;
    private EditText edNombre;
    private EditText edApellido;
    private EditText edTelefono;
    private EditText edEmail;
    private EditText edPass;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PerfilFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PerfilFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static PerfilFragment newInstance(String param1, String param2) {
        PerfilFragment fragment = new PerfilFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_perfil, container, false);

        edDni=root.findViewById(R.id.etDni);
        edNombre=root.findViewById(R.id.etnombre);
        edApellido=root.findViewById(R.id.etapellido);
        edTelefono=root.findViewById(R.id.ettelefono);
        edEmail=root.findViewById(R.id.etEmail);
        edPass=root.findViewById(R.id.etPass);
        Button editar= root.findViewById(R.id.btnEditar);
        editar.setOnClickListener(new View.OnClickListener() {//capturo la accion del boton
            @Override
            public void onClick(View v) {
                //deberia llevarme a la pantalla de inicio despues de cargar el perfil modificado
            }
        });
        return root;
    }

}
