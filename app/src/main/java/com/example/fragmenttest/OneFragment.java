package com.example.fragmenttest;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class OneFragment extends Fragment {
    EditText editText;
    Button button;




    public OneFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_one, container, false);
        button= view.findViewById(R.id.btn);
        editText=view.findViewById(R.id.et);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                bundle.putString("key",editText.getText().toString());

                TwoFragment fragment=new TwoFragment() ;
                fragment.setArguments(bundle);
                getFragmentManager().beginTransaction().replace(R.id.main,fragment).commit();
            }
        });

        return view;
    }
}