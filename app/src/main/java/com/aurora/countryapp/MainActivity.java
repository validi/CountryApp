package com.aurora.countryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.aurora.countryapp.databinding.ActivityMainBinding;
import com.aurora.countryapp.model.Country;
import com.aurora.countryapp.service.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_main);

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSubmit:
                String s = binding.textInputEditText2.getText().toString();
                if (!s.equals("")) {
                    binding.txtResult.setText("loading...");
                    getCountry(s);
                }

                break;
        }
    }

    public String getCountry(String fullname) {
        final String[] result = {""};
        RetrofitClientInstance.getCountryRetrofitInstance().getCountry(fullname).enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                // result[0] =response.code()+"";
                String res = response.body().toString();
                if (response.code() == 200) {
                    result[0] = res.substring(2, res.length() - 2).replaceAll(",", "\n");
                } else if (response.code() == 404) {
                    result[0] = "Not Found";
                } else {

                }
                Log.i("TAG", result[0]);
                binding.txtResult.setText(result[0] + "");
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                Log.i("TAG", t.getMessage() + "---------");
            }
        });
        return result[0];
    }
}