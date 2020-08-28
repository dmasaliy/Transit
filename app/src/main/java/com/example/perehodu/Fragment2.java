package com.example.perehodu;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Fragment2 extends Fragment {
    Button next;
    Button back;
    TextView textView;

    Fragment2ClickListener listener;

    String strArg;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try{
            listener = (Fragment2.Fragment2ClickListener) context;
        } catch (ClassCastException e){
            e.printStackTrace();
        }

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        strArg = getArguments().getString(MainActivity.BUNDLE_STRING, "");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2, container, false);

        next = view.findViewById(R.id.forv2_2);
        back = view.findViewById(R.id.back1_1);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onFragment2NextClick();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onFragment2BackClick();
            }
        });

        textView = view.findViewById(R.id.textView2_2);
        textView.setText(strArg);

        return view;
    }

    public interface Fragment2ClickListener{
        void onFragment2NextClick();
        void onFragment2BackClick();
    }
}