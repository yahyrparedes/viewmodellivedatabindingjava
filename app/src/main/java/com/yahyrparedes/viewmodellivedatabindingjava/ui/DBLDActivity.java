package com.yahyrparedes.viewmodellivedatabindingjava.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.yahyrparedes.viewmodellivedatabindingjava.R;
import com.yahyrparedes.viewmodellivedatabindingjava.databinding.ActivityDbldBinding;
import com.yahyrparedes.viewmodellivedatabindingjava.util.User;
import com.yahyrparedes.viewmodellivedatabindingjava.viewmodel.DBLDViewModel;

public class DBLDActivity extends AppCompatActivity {

    private DBLDViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDbldBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_dbld);

        binding.setLifecycleOwner(this);
        viewModel = ViewModelProviders.of(this).get(DBLDViewModel.class);
        binding.setViewModel(viewModel);

        User user = new User("Alberto", "30");
        viewModel.setUser(user);
    }
}