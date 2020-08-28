package com.example.perehodu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.Fragment1ClickListener,
        Fragment2.Fragment2ClickListener {

    NavController navHostController;
    public static final String BUNDLE_STRING = "string";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navHostController =Navigation.findNavController(this, R.id.nav_host_fragment);

    }

    @Override
    public void onFragment1NextClick() {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_STRING, "Hello fromfragment1");
        navHostController.navigate(R.id.action_fragment1_to_fragment2, bundle);
    }

    @Override
    public void onFragment1BackClick() {
        this.finish();
    }

    @Override
    public void onFragment2NextClick() {
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_STRING,"Some String");
        navHostController.navigate(R.id.secondActivity, bundle);
    }

    @Override
    public void onFragment2BackClick() {
        navHostController.popBackStack();
    }
}