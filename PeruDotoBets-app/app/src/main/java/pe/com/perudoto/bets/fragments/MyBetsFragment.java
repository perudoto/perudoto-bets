package pe.com.perudoto.bets.fragments;

import pe.com.perudoto.bets.R;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
 
public class MyBetsFragment extends Fragment {
     
    public MyBetsFragment(){}
     
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_mybets, container, false);
          
        return rootView;
    }
}