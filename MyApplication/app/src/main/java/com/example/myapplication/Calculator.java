package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityCalculatorBinding;

import java.nio.charset.StandardCharsets;

public class Calculator extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityCalculatorBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityCalculatorBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_calculator);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void onClickBtn1(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="1";
        t.setText(msg);
    }

    public void onClickBtn2(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="2";
        t.setText(msg);
    }

    public void onClickBtn3(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="3";
        t.setText(msg);
    }

    public void onClickBtn4(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="4";
        t.setText(msg);
    }
    public void onClickBtn5(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="5";
        t.setText(msg);
    }

    public void onClickBtn6(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="6";
        t.setText(msg);
    }

    public void onClickBtn7(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="7";
        t.setText(msg);
    }

    public void onClickBtn8(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="8";
        t.setText(msg);
    }

    public void onClickBtn9(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="9";
        t.setText(msg);
    }

    public void onClickBtnPlus(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="+";
        t.setText(msg);
    }

    public void onClickBtnMinus(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="-";
        t.setText(msg);
    }

    public void onClickBtnMultiply(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="*";
        t.setText(msg);
    }

    public void onClickBtnDivide(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();
        msg+="/";
        t.setText(msg);
    }

    /**
     * supplrt only singe operations, such as 1+1, 2*2 etc.
     * @param view
     */
    public void onClickBtnEquals(View view) {
        TextView t = findViewById(R.id.inputText);
        String msg = t.getText().toString();

        if (msg.indexOf("+")!=-1){
            int d = msg.indexOf("+");
            String item1 = "";
            String item2 = "";
            String result = "0";
            try{
                for (int i=0; i<d; i++){
                    item1+= msg.charAt(i);
                }
                for (int i=d+1; i<msg.length(); i++){
                    item2+=msg.charAt(i);
                }
                long t1 = Long.parseLong(item1);
                long t2 = Long.parseLong(item2);
                Long rez = t1+t2;
                result = rez.toString();
            }
            catch (NullPointerException e){
                e.printStackTrace();
            }
           t.setText(result);
        }
        if (msg.indexOf("-")!=-1) {
            int d = msg.indexOf("+");
            String item1 = "";
            String item2 = "";
            String result = "0";
            try{
                for (int i=0; i<d; i++){
                    item1+= msg.charAt(i);
                }
                for (int i=d+1; i<msg.length(); i++){
                    item2+=msg.charAt(i);
                }
                long t1 = Long.parseLong(item1);
                long t2 = Long.parseLong(item2);
                Long rez = t1-t2;
                result = rez.toString();
            }
            catch (NullPointerException e){
                e.printStackTrace();
            }
            t.setText(result);
        }
        if (msg.indexOf("*")!=-1){
            int d = msg.indexOf("+");
            String item1 = "";
            String item2 = "";
            String result = "0";
            try{
                for (int i=0; i<d; i++){
                    item1+= msg.charAt(i);
                }
                for (int i=d+1; i<msg.length(); i++){
                    item2+=msg.charAt(i);
                }
                long t1 = Long.parseLong(item1);
                long t2 = Long.parseLong(item2);
                Long rez = t1*t2;
                result = rez.toString();
            }
            catch (NullPointerException e){
                e.printStackTrace();
            }
            t.setText(result);
        }
        if (msg.indexOf("/")!=-1){
            int d = msg.indexOf("+");
            String item1 = "";
            String item2 = "";
            String result = "0";
            try{
                for (int i=0; i<d; i++){
                    item1+= msg.charAt(i);
                }
                for (int i=d+1; i<msg.length(); i++){
                    item2+=msg.charAt(i);
                }
                long t1 = Long.parseLong(item1);
                long t2 = Long.parseLong(item2);
                Long rez = t1/t2;
                result = rez.toString();
            }
            catch (NullPointerException e){
                e.printStackTrace();
            }
            t.setText(result);
        }
        t.setText(msg);
    }

    public void onClickBtnCE(View view) {
        TextView txt = findViewById(R.id.inputText);
        txt.setText("");

    }


}