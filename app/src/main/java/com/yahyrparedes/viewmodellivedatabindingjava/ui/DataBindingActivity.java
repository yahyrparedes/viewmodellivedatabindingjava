package com.yahyrparedes.viewmodellivedatabindingjava.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.os.Bundle;

import com.yahyrparedes.viewmodellivedatabindingjava.R;
import com.yahyrparedes.viewmodellivedatabindingjava.databinding.ActivityDataBindingBinding;
import com.yahyrparedes.viewmodellivedatabindingjava.util.User;

public class DataBindingActivity extends AppCompatActivity {

    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_data_binding);

        ActivityDataBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding);
        user = new User("Alberto", "30");

        binding.setUser(user);
    }
}