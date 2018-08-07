package com.example.gisilk.techmeetup;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ExplorerFragment extends Fragment {

    private Spinner spinner;
    private static final String[] tags = {"Select a tag","Android","Angular","Java","Ionic","Cordova","C#","Blockchain","Azure Machine Learning"};

    @SuppressLint("ResourceType")
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View v =inflater.inflate(R.layout.fragment_explorer,container,false);


        spinner = v.findViewById(R.id.dropdownTags);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this.getActivity(),R.layout.support_simple_spinner_dropdown_item, tags);


        spinner.setAdapter(adapter);

        return v;

    }
}
