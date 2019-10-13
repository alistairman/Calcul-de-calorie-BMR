/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esi.atl.g48502.bmr.model;

import java.util.List;

/**
 *
 * @author alistairclerebaut
 */
public class Model_Bmr{
    
    private List<Activities> activity;
    
    public Model_Bmr(){
//        for(Activities a : Activities.values()){
//            activity.add(a);
//        }

          activity.add(Activities.ACTIF);
          activity.add(Activities.EXTREME_ACTIF);
          activity.add(Activities.SEDENTAIRE);
    }

    public List<Activities> getActivity() {
        return activity;
    }

    
    
}