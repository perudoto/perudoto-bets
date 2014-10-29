package pe.com.perudoto.fragments;

import java.util.ArrayList;

import pe.com.perudoto.R;


import android.R.anim;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

 
public class MatchesFragment extends Fragment {
     
    public MatchesFragment(){}
     
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
  
        View rootView = inflater.inflate(R.layout.fragment_matches, container, false);
          
        ListView myList ;
        
        String[] listaMatches = {
        		 "Na'vi  vs Tinker",
        		 "Secret  vs  EG",
        		 "Alliance vs Gnatic",
        		 "VP vs Cloud9",
        		 "Empire vs Tinker", 
        		 "MiTH  vs  Malaysia",
        		 "MVP.P  vs Zephyr",
        		 "Idol  vs  Rave",
        		 "IG  vs  LGD",
        		 "Secret  vs  VP.Polar"
        		      		 
        };
        
        myList = (ListView) rootView.findViewById(R.id.list);
       ArrayAdapter<String> arrayMatches = new ArrayAdapter<String>(this.getActivity(), R.layout.fragment_matches_part,listaMatches);
      
        myList.setAdapter(arrayMatches);
        
        
        
        
        
        return rootView;
    }
}