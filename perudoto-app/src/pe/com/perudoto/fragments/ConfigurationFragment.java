package pe.com.perudoto.fragments;

import pe.com.perudoto.R;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class ConfigurationFragment extends Fragment {
     
    public ConfigurationFragment(){}
     
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_configuration, container, false);
          
        return rootView;
    }
}